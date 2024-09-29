package com.itschool.library.utils.design_patterns.structural.facade.example_two;

public class HomeTheaterTestDrive {
     public static void main(String[] args) {
        // Create subsystem instances
        Amplifier amp = new Amplifier();
        Tuner tuner = new Tuner();
        StreamingPlayer player = new StreamingPlayer();
        Projector projector = new Projector();
        Screen screen = new Screen();
        TheaterLights lights = new TheaterLights();
        PopcornPopper popper = new PopcornPopper();

        // Create the facade
        HomeTheaterFacade homeTheater = new HomeTheaterFacade(amp, tuner, player, projector, screen, lights, popper);

        // Use the facade to watch a movie
        homeTheater.watchMovie("Inception");

        System.out.println("\n----- Movie is playing -----\n");

        // End the movie
        homeTheater.endMovie();
    }
}