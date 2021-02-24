package ru.mshkolniy.exchangerates.model.gif;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class AllGifsJson {

    @JsonProperty("data")
    public List<DataSectionGifsJson> mainData;

    public List<DataSectionGifsJson> getMainData() {
        return mainData;
    }
}
