package ru.mshkolniy.exchangerates.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.*;
import ru.mshkolniy.exchangerates.model.Rate;
import ru.mshkolniy.exchangerates.service.RateService;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Map;

@RestController
@EnableAutoConfiguration
@RequestMapping("/")
public class RateController {
    private static final String APP_ID = "1ce73ad6a57744ba8514dd76d877b297";
    private static final LocalDate YESTERDAY = LocalDate.now().minusDays(1L);

    private final RateService rateService;

    public RateController(RateService rateService) {
        this.rateService = rateService;
    }

//    Example request: "http://localhost:8080/today"
    @GetMapping("today")
    Rate getLatestRates() {
        return rateService.getLatestRates(APP_ID);
    }

//    Example request: "http://localhost:8080/today"
    @GetMapping("yesterday")
    Rate getYesterdaysRates() {
        return rateService.getHistoricalRates(YESTERDAY.toString(), APP_ID);
    }

//    Example request: "http://localhost:8080/compare?currency=EUR"
    @GetMapping("compare")
    String compareCurrency(@RequestParam String currency) {
        Map<String, BigDecimal> todays = rateService.getLatestRates(APP_ID).getRates();
        Map<String, BigDecimal> yesterdays = rateService.getHistoricalRates(YESTERDAY.toString(), APP_ID).getRates();

        BigDecimal rubToday = todays.get("RUB");
        BigDecimal rubYesterday = yesterdays.get("RUB");
        BigDecimal customToday = todays.get(currency.toUpperCase());
        BigDecimal customYesterday = yesterdays.get(currency.toUpperCase());

        int rateHigher = rubToday.subtract(customToday).compareTo(rubYesterday.subtract(customYesterday));

        if (rateHigher > 0) {
            return "rich";
        }

        if (rateHigher < 0) {
            return "poor";
        }

        return "The exchange rate has not changed.";
    }

//    Optional:
//    list of exchange rates for any date, starting from 1st January 1999.
//    Example request: "http://localhost:8080/historical/2016-10-10"
    @GetMapping("historical/{date}")
    Rate getHistoricalRates(@PathVariable("date") String anyDate) {
        return rateService.getHistoricalRates(anyDate, APP_ID);
    }
}
