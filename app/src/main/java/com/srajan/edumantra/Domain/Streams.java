package com.srajan.edumantra.Domain;

/**
 * Created by rajan on 8/4/17.
 */

public class Streams {

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStreamName() {
        return streamName;
    }

    public void setStreamName(String streamName) {
        this.streamName = streamName;
    }

    private String id;
    private String streamName;

    @Override
    public String toString() {
        return "Streams{" +
                "id='" + id + '\'' +
                ", streamName='" + streamName + '\'' +
                '}';
    }
}
