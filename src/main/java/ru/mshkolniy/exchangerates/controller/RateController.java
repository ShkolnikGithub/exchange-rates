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

    @Autowired
    private RateService rateService;

    @GetMapping("latest.json")
    Rate getLatestRates(@RequestParam String app_id) {
        Rate rates = rateService.getLatestRates(APP_ID);
        return rates;
    }

    @GetMapping("yesterday")
    Rate getYesterdaysRates(@RequestParam String app_id) {
        Rate rates = rateService.getYesterdaysRates(YESTERDAY.toString(), APP_ID);
        return rates;
    }

    @GetMapping("compare")
    String compareCurrency(@RequestParam String currency) {
        Map<String, BigDecimal> todays = rateService.getLatestRates(APP_ID).getRates();
        Map<String, BigDecimal> yesterdays = rateService.getHistoricalRates(YESTERDAY.toString(), APP_ID).getRates();

        if (todays.get(currency.toUpperCase()).compareTo(yesterdays.get(currency.toUpperCase())) < 0) {
            return "rich";
        } else if (todays.get(currency).compareTo(yesterdays.get(currency)) > 0) {
            return "poor";
        }

        return "The exchange rate has not changed.";
    }

//    @GetMapping("historical/{date}.json")
//    RateMainDto getHistoricalRates(@PathVariable("date") String anyDate, @RequestParam String app_id) {
//        RateMainDto rates = rateService.getHistoricalRates(anyDate, APP_ID);
//        return rates;
//    }
}
