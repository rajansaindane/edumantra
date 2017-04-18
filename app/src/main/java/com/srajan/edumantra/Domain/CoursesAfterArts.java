package com.srajan.edumantra.Domain;

import java.util.List;

/**
 * Created by rajan on 17/4/17.
 */

public class CoursesAfterArts {

    private String id;
    private List<String> artsStreams;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<String> getArtsStreams() {
        return artsStreams;
    }

    public void setArtsStreams(List<String> artsStreams) {
        this.artsStreams = artsStreams;
    }
}
