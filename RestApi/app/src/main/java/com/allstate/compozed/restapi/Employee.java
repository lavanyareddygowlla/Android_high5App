package com.allstate.compozed.restapi;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Employee {

    @JsonProperty("base")
    String base;

    @JsonProperty("date")
    String date;

    @JsonProperty("rates")
    Rates rates;

    public Employee() {
    }


    public Employee(String base, Rates rates, String date) {
        this.base = base;
        this.rates = rates;
        this.date = date;
    }

    public String getBase() {
        return base;
    }

    public String getDate() {
        return date;
    }

    public Rates getStatus() {
        return rates;
    }


//    public Map<String,Float> getRates(){
//
//        Map map=new HashMap();
//        map.put("AUD",1.414);
//        map.put("USD",2.414);
//        this.rates.add(map);
//        return map;
//    }
}
