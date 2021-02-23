package ru.mshkolniy.exchangerates.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.*;
import ru.mshkolniy.exchangerates.model.Gif;
import ru.mshkolniy.exchangerates.service.GifService;

@RestController
@EnableAutoConfiguration
@RequestMapping("/")
public class GifController {
    private static final String APP_KEY = "pL6IdjWbR4LLUwPaQXHdHcxBURndpDuc";

    private final GifService gifService;

    public GifController(GifService gifService) {
        this.gifService = gifService;
    }

    @GetMapping("rich")
    Gif rich() {
        return gifService.getGif(APP_KEY, "rich");
    }
}
