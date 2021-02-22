package ru.mshkolniy.exchangerates.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.*;
import ru.mshkolniy.exchangerates.model.RateMainJSON;
import ru.mshkolniy.exchangerates.model.Rate;
import ru.mshkolniy.exchangerates.service.RateService;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
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
    RateMainJSON getAllLatestRates(@RequestParam String app_id) {
        RateMainJSON rates = rateService.getAllLatestRates(APP_ID);
        return rates;
    }

    @GetMapping("historical/{date}.json")
    RateMainJSON getAllYesterdaysRates(@PathVariable("date") String date, @RequestParam String app_id) {
        RateMainJSON rates = rateService.getAllYesterdaysRates(YESTERDAY.toString(), APP_ID);
        return rates;
    }

    @GetMapping("compare")
    String compareCurrency(@RequestParam String currency) {
        Rate todays = rateService.getAllLatestRates(APP_ID).getRates();
        Rate yesterdays = rateService.getAllYesterdaysRates("2021-02-21", APP_ID).getRates();

        if (todays.get(currency).compareTo(yesterdays.get(currency)) > 0) {
            return "rich";
        } else if (todays.get(currency).compareTo(yesterdays.get(currency)) < 0) {
            return "poor";
        }

        return null;
    }




//    @GetMapping("historical/{date}.json")
//    List<Rate> getAllHistoricalRates(@PathVariable("date") LocalDate anyDate, @RequestParam String app_id) {
//        List<Rate> rates = rateService.getAllYesterdaysRates(anyDate, APP_ID);
//        return rates;
//    }
}
