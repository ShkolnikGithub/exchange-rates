package ru.mshkolniy.exchangerates.service;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "Gif")
public interface GifService {
}
