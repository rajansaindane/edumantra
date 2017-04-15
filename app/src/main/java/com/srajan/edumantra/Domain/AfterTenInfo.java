package com.srajan.edumantra.Domain;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by rajan on 13/4/17.
 */

public class AfterTenInfo
{
    private List<AfterTen> afterten = null;

    private String status;

    public List<AfterTen> getAfterten() {
        return afterten;
    }

    public void setAfterten(List<AfterTen> afterten) {
        this.afterten = afterten;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
