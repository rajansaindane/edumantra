package com.srajan.edumantra.Domain;

import java.util.List;

/**
 * Created by rajan on 17/4/17.
 */

public class CoursesAfterTwelve {

    private String id;
    private List<String> pcm;
    private List<String> pcb;
    private List<String> pcmb;
    private List<String> dEd;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<String> getPcm() {
        return pcm;
    }

    public void setPcm(List<String> pcm) {
        this.pcm = pcm;
    }

    public List<String> getPcb() {
        return pcb;
    }

    public void setPcb(List<String> pcb) {
        this.pcb = pcb;
    }

    public List<String> getPcmb() {
        return pcmb;
    }

    public void setPcmb(List<String> pcmb) {
        this.pcmb = pcmb;
    }

    public List<String> getdEd() {
        return dEd;
    }

    public void setdEd(List<String> dEd) {
        this.dEd = dEd;
    }
}
