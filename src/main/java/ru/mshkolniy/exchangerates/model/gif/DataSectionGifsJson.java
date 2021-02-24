package ru.mshkolniy.exchangerates.model.gif;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class DataSectionGifsJson {

    @JsonProperty("images")
    public ImagesSectionGifsJson images;

    public ImagesSectionGifsJson getImages() {
        return images;
    }
}
