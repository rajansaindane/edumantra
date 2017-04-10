package com.srajan.edumantra.Domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by rajan on 24/3/17.
 */

public class ScienceAftTen  implements Serializable{

    private String id;
    private ArrayList<String> scienceafterten;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ArrayList<String> getScienceafterten() {
        return scienceafterten;
    }

    public void setScienceafterten(ArrayList<String> scienceafterten) {
        this.scienceafterten = scienceafterten;
    }

    @Override
    public String toString() {
        return "ScienceAftTen{" +
                "id='" + id + '\'' +
                ", scienceafterten=" + scienceafterten +
                '}';
    }
}
