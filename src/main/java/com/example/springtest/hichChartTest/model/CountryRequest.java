package com.example.springtest.hichChartTest.model;

public class CountryRequest {

    String Country;
    long Requests;

    public CountryRequest(String Country, long Requests) {
        this.Country = Country;
        this.Requests = Requests;
    }

    public String getCountry() {
        return Country;
    }

    public long getRequests() {
        return Requests;
    }
}
