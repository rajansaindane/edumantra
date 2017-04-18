package com.srajan.edumantra.Domain;

import java.io.Serializable;
import java.util.List;

/**
 * Created by rajan on 12/4/17.
 */

public class AfterTen  {

    private String id;
    private List<String> afterTenScience = null;
    private List<String> afterTenArts = null;
    private List<String> afterTenCommerce = null;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<String> getAfterTenScience() {
        return afterTenScience;
    }

    public List<String> getAfterTenArts() {
        return afterTenArts;
    }

    public void setAfterTenArts(List<String> afterTenArts) {
        this.afterTenArts = afterTenArts;
    }

    public void setAfterTenScience(List<String> afterTenScience) {
        this.afterTenScience = afterTenScience;


    }

    public List<String> getAfterTenCommerce() {
        return afterTenCommerce;
    }

    public void setAfterTenCommerce(List<String> afterTenCommerce) {
        this.afterTenCommerce = afterTenCommerce;
    }
}

