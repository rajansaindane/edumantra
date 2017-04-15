package com.srajan.edumantra.Domain;

import java.util.List;

/**
 * Created by rajan on 14/4/17.
 */

public class AfterTwelve {

    private String id;
    private List<String> mainCourseName = null;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<String> getMainCourseName() {
        return mainCourseName;
    }

    public void setMainCourseName(List<String> mainCourseName) {
        this.mainCourseName = mainCourseName;
    }

}
