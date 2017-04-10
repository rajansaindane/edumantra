package com.srajan.edumantra.Domain;

import java.io.Serializable;
import java.util.List;

/**
 * Created by rajan on 8/4/17.
 */

public class MainCourses implements Serializable {

    private String id;
    private String classType;
    private String mainCourseName;
    private List<Description> descriptions;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getClassType() {
        return classType;
    }

    public void setClassType(String classType) {
        this.classType = classType;
    }

    public String getMainCourseName() {
        return mainCourseName;
    }

    public void setMainCourseName(String mainCourseName) {
        this.mainCourseName = mainCourseName;
    }

    public List<Description> getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(List<Description> descriptions) {
        this.descriptions = descriptions;
    }

    @Override
    public String toString() {
        return "MainCourses{" +
                "id='" + id + '\'' +
                ", classType='" + classType + '\'' +
                ", mainCourseName='" + mainCourseName + '\'' +
                ", descriptions=" + descriptions +
                '}';
    }
}
