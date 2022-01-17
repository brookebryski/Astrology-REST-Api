package com.example.AstrologyRESTApi;

public class Astrology {

    private final long id;
    private final String content;

    public Astrology(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}

// This is a resource representation class to model the representation of data