package com.allstate.compozed.restapi;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by localadmin on 12/01/17.
 */

public class Rates {

    @JsonProperty("GBP")
    String GBP;

    @JsonProperty("USD")
    String USD;

    public Rates(String GBP, String USD) {
        this.GBP = GBP;
        this.USD = USD;
    }

    public Rates() {
    }
}
