package com.srajan.edumantra.Domain;

/**
 * Created by rajan on 11/4/17.
 */

public class AfterTen {

    private String id;
    private String mainCourseName;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMainCourseName() {
        return mainCourseName;
    }

    @Override
    public String toString() {
        return "AfterTen{" +
                "id='" + id + '\'' +
                ", mainCourseName='" + mainCourseName + '\'' +
                '}';
    }

    public void setMainCourseName(String mainCourseName) {
        this.mainCourseName = mainCourseName;


    }
}
