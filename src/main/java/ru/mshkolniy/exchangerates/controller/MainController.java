package ru.mshkolniy.exchangerates.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import ru.mshkolniy.exchangerates.service.GifService;
import ru.mshkolniy.exchangerates.service.RateService;

import javax.servlet.http.HttpServletRequest;
import java.math.BigDecimal;
import java.util.Map;

import static ru.mshkolniy.exchangerates.controller.RateController.APP_ID;
import static ru.mshkolniy.exchangerates.controller.RateController.YESTERDAY;

@Controller
@EnableAutoConfiguration
public class MainController {

    private final RateService rateService;
    private final GifService gifService;
    private final GifController gifController;

    public MainController(RateService rateService, GifService gifService, GifController gifController) {
        this.rateService = rateService;
        this.gifService = gifService;
        this.gifController = gifController;
    }

//    Example request: "http://localhost:8080/compare?currency=EUR"
    @RequestMapping(value = "/compare", method = RequestMethod.GET)
    String compareCurrency(@RequestParam String currency, HttpServletRequest request) {
        Map<String, BigDecimal> todays = rateService.getLatestRates(APP_ID).getRates();
        Map<String, BigDecimal> yesterdays = rateService.getHistoricalRates(YESTERDAY.toString(), APP_ID).getRates();

        BigDecimal rubToday = todays.get("RUB");
        BigDecimal rubYesterday = yesterdays.get("RUB");
        BigDecimal customToday = todays.get(currency.toUpperCase());
        BigDecimal customYesterday = yesterdays.get(currency.toUpperCase());

        int rateHigher = rubToday.subtract(customToday).compareTo(rubYesterday.subtract(customYesterday));

        if (rateHigher > 0) {
            return "redirect:" + gifController.getGif("rich").toString();
        }

        if (rateHigher < 0) {
            return "redirect:" + gifController.getGif("poor").toString();
        }

        return "redirect:" + gifController.getGif("duck").toString();
    }
}
