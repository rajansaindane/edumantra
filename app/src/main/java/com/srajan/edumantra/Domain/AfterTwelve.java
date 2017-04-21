package com.srajan.edumantra.Domain;

import java.util.List;

/**
 * Created by rajan on 14/4/17.
 */

public class AfterTwelve {

    private String id;
    private List<String> afterTwelveScience = null;
    private List<String> afterTwelveArts = null;
    private List<String> afterTwelveCommerce = null;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<String> getAfterTwelveScience() {
        return afterTwelveScience;
    }

    public void setAfterTwelveScience(List<String> afterTwelveScience) {
        this.afterTwelveScience = afterTwelveScience;
    }

    public List<String> getAfterTwelveArts() {
        return afterTwelveArts;
    }

    public void setAfterTwelveArts(List<String> afterTwelveArts) {
        this.afterTwelveArts = afterTwelveArts;
    }

    public List<String> getAfterTwelveCommerce() {
        return afterTwelveCommerce;
    }

    public void setAfterTwelveCommerce(List<String> afterTwelveCommerce) {
        this.afterTwelveCommerce = afterTwelveCommerce;
    }
}
