package ru.mshkolniy.exchangerates.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import ru.mshkolniy.exchangerates.model.Rate;

@FeignClient(name = "Rate", url = "https://openexchangerates.org/api/")
public interface RateService {

//    list of latest currency exchange rates
    @GetMapping("latest.json")
    Rate getLatestRates(@RequestParam String app_id);

//    list of currency exchange rates for yesterday
    @GetMapping("historical/{date}.json")
    Rate getYesterdaysRates(@PathVariable("date") String yesterday, @RequestParam String app_id);

    @GetMapping("compare")
    String compareCurrency(@RequestParam String currency);

//    Optional:
//    list of exchange rates for any date, starting from 1st January 1999.
    @GetMapping("historical/{date}.json")
    Rate getHistoricalRates(@PathVariable("date") String anyDate, @RequestParam String app_id);
}
