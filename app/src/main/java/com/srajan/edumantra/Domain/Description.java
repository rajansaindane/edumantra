package com.srajan.edumantra.Domain;

import java.util.ArrayList;

/**
 * Created by rajan on 21/4/17.
 */

public class Description {

    private String id;
    private String mainCourseName;
    private String classType;
    private ArrayList<DescriptionInfo> descriptions;
    private float score;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMainCourseName() {
        return mainCourseName;
    }

    public void setMainCourseName(String mainCourseName) {
        this.mainCourseName = mainCourseName;
    }

    public String getClassType() {
        return classType;
    }

    public void setClassType(String classType) {
        this.classType = classType;
    }


    public ArrayList<DescriptionInfo> getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(ArrayList<DescriptionInfo> descriptions) {
        this.descriptions = descriptions;
    }

    public float getScore() {
        return score;
    }

    public void setScore(float score) {
        this.score = score;
    }
}
