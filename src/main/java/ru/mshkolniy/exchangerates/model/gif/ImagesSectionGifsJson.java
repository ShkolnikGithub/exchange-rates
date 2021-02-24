package ru.mshkolniy.exchangerates.model.gif;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ImagesSectionGifsJson {

    @JsonProperty("original")
    public Gif gif;

    public Gif getGif() {
        return gif;
    }
}
