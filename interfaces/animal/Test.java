package interfaces.animal;

import interfaces.devices.SmartPhone;

public class Test {
    public static void main(String[] args) {
        // Dog dog = new Dog();
        // dog.eat();
        // System.out.println(Dog.Max_age);
        // Animal.info();
        // dog.run();
        SmartPhone sf1 = new SmartPhone();
        sf1.Call();
        sf1.SendMessage();
        sf1.play();
        sf1.pause();
        sf1.recordVideo();
        sf1.takePhoto();
    }
}