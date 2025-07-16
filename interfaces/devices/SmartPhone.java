package interfaces.devices;

public class SmartPhone implements Camera, MusicPlayer, Phone {
    
    @Override
    public void takePhoto() {
        System.out.println("Taking a photo...");
    }

    @Override
    public void recordVideo() {
        System.out.println("Recording video...");
    }  

    @Override
    public void play() {
        System.out.println("Playing music...");
    }

    @Override
    public void pause() {
        System.out.println("Pausing music...");
    }

    @Override
    public void Call() {
        System.out.println("Making a call...");
    }

    @Override
    public void SendMessage() {
        System.out.println("Sending a message...");
    }
}
