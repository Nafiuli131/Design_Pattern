package org.example.Facade;
// Subsystem: DVD Player
public class DVDPlayer {
    public void on() {
        System.out.println("DVD player is turned on");
    }

    public void playMovie(String movie) {
        System.out.println("Playing movie: " + movie);
    }

    public void stop() {
        System.out.println("DVD player stopped");
    }

    public void off() {
        System.out.println("DVD player is turned off");
    }
}
