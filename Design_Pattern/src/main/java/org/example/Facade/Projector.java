package org.example.Facade;
// Subsystem: Projector
class Projector {
    public void on() {
        System.out.println("Projector is turned on");
    }

    public void setInput(String input) {
        System.out.println("Setting projector input to: " + input);
    }

    public void off() {
        System.out.println("Projector is turned off");
    }
}
