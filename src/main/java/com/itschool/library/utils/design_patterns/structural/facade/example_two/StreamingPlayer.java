package com.itschool.library.utils.design_patterns.structural.facade.example_two;

public class StreamingPlayer {
    private String movie;

    public void on() {
        System.out.println("Streaming Player on");
    }

    public void play(String movie) {
        this.movie = movie;
        System.out.println("Streaming Player playing \"" + movie + "\"");
    }

    public void stop() {
        System.out.println("Streaming Player stopped \"" + movie + "\"");
    }

    public void off() {
        System.out.println("Streaming Player off");
    }
}