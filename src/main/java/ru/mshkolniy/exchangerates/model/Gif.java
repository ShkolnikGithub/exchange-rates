package ru.mshkolniy.exchangerates.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Gif {

    @JsonProperty("bitly_url")
    private String url;

    public String getUrl() {
        return url;
    }
}
