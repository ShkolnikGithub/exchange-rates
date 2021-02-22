package ru.mshkolniy.exchangerates.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import ru.mshkolniy.exchangerates.model.RateMainJSON;
import ru.mshkolniy.exchangerates.model.Rate;

import java.time.LocalDate;
import java.util.List;

@FeignClient(name = "Rate", url = "https://openexchangerates.org/api")
public interface RateService {

//    list of latest currency exchange rates
    @GetMapping("/latest.json")
    RateMainJSON getAllLatestRates(@RequestParam String app_id);

//    list of currency exchange rates for yesterday
    @GetMapping("/historical/{date}.json")
    RateMainJSON getAllYesterdaysRates(@PathVariable("date") String yesterday, @RequestParam String app_id);

    @GetMapping("compare")
    String compareCurrency(@RequestParam String currency);
//    Optional:
//    list of exchange rates for any date, starting from 1st January 1999.
//    @GetMapping("historical/{date}.json")
//    List<Rate> getAllHistoricalRates(@PathVariable("date") LocalDate anyDate, @RequestParam String app_id);
}
