package com.srajan.edumantra.Domain;

import java.util.List;

/**
 * Created by rajan on 14/4/17.
 */

public class AfterTwelveInfo {

    private List<AfterTwelve> aftertwelve = null;

    private String status;

    public List<AfterTwelve> getAftertwelve() {
        return aftertwelve;
    }

    public void setAftertwelve(List<AfterTwelve> aftertwelve) {
        this.aftertwelve = aftertwelve;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}
