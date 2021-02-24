package ru.mshkolniy.exchangerates.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.mshkolniy.exchangerates.model.Rate;
import ru.mshkolniy.exchangerates.service.RateService;

import java.time.LocalDate;

@RestController
@EnableAutoConfiguration
@RequestMapping("/")
public class RateController {
    public static final String APP_ID = "1ce73ad6a57744ba8514dd76d877b297";
    public static final LocalDate YESTERDAY = LocalDate.now().minusDays(1L);

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

//    Optional:
//    list of exchange rates for any date, starting from 1st January 1999.
//    Example request: "http://localhost:8080/historical/2016-10-10"
    @GetMapping("historical/{date}")
    Rate getHistoricalRates(@PathVariable("date") String anyDate) {
        return rateService.getHistoricalRates(anyDate, APP_ID);
    }
}
