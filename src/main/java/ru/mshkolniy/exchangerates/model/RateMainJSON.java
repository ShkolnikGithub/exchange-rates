package ru.mshkolniy.exchangerates.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RateMainJSON {

    @JsonProperty("disclaimer")
    private String disclaimer;

    @JsonProperty("license")
    private String license;

    @JsonProperty("timestamp")
    private Long timestamp;

    @JsonProperty("base")
    private String base;

    @JsonProperty("rates")
    private Rate rates;

    public String getDisclaimer() {
        return disclaimer;
    }

    public void setDisclaimer(String disclaimer) {
        this.disclaimer = disclaimer;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public Rate getRates() {
        return rates;
    }

    public void setRates(Rate rates) {
        this.rates = rates;
    }
}
