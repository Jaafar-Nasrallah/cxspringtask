package com.example.springtest.hichChartTest.controller;

import com.example.springtest.hichChartTest.model.CountryRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ApiController {
    @GetMapping(value = "/api/countries", produces="application/json")
    @ResponseBody
    public CountryRequest[] apiReturn() {
        CountryRequest[] requests = new CountryRequest[2];
        CountryRequest countryRequestLebanon = new CountryRequest("Lebanon",100);
        CountryRequest countryRequestUAE = new CountryRequest("UAE",200);
        requests[0] = countryRequestLebanon;
        requests[1] = countryRequestUAE;
        return requests;

    }
}
