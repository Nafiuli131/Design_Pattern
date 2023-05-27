package org.example.Facade;
// Subsystem: Sound System
class SoundSystem {
    public void on() {
        System.out.println("Sound system is turned on");
    }

    public void setVolume(int volume) {
        System.out.println("Setting sound system volume to: " + volume);
    }

    public void off() {
        System.out.println("Sound system is turned off");
    }
}
