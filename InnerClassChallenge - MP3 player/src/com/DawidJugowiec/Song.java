package com.DawidJugowiec;

public class Song {
    private String title;
    private String duration;

    public String getTitle() {
        return title;
    }

    public String getDuration() {
        return duration;
    }

    public Song(String title, String duration) {
        this.title = title;
        this.duration = duration;
    }
}
