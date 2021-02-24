package ru.mshkolniy.exchangerates.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.mshkolniy.exchangerates.model.gif.Gif;
import ru.mshkolniy.exchangerates.service.GifService;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

@RestController
@EnableAutoConfiguration
@RequestMapping("/")
public class GifController {
    public static final String APP_KEY = "pL6IdjWbR4LLUwPaQXHdHcxBURndpDuc";

    private final GifService gifService;

    public GifController(GifService gifService) {
        this.gifService = gifService;
    }

    Gif getGif(String richOrPoor) {
        List<Gif> gifList = gifService.getGif(APP_KEY, richOrPoor).getMainData()
                .stream().map(datum -> datum.getImages()).collect(Collectors.toList())
                .stream().map(original -> original.getGif()).collect(Collectors.toList());
        return getRandomGif(gifList);
    }

    public Gif getRandomGif(List<Gif> list) {
        Random random = new Random();
        return list.get(random.nextInt(list.size()));
    }
}
