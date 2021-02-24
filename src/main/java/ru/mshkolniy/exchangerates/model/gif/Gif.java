package ru.mshkolniy.exchangerates.model.gif;

import com.fasterxml.jackson.annotation.*;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Gif {

    @JsonProperty("url")
    private String url;

    public String getUrl() {
        return url;
    }

    public Gif() {

    }

    public Gif(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return url;
    }
}
