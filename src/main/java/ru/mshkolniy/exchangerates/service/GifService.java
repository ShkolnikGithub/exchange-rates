package ru.mshkolniy.exchangerates.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ru.mshkolniy.exchangerates.model.Gif;

@FeignClient(name = "Gif", url = "api.giphy.com/v1/gifs/search/")
public interface GifService {

//    https://api.giphy.com/v1/gifs/search?api_key=pL6IdjWbR4LLUwPaQXHdHcxBURndpDuc&q=rich
    @GetMapping()
    Gif getGif(@RequestParam("api_key") String apiKey,
               @RequestParam("q") String keyword);
}
