package interfaces.animal;

public interface Animal {
    int Max_age = 17;
    void eat();
    void sleep();
    static void info(){
        System.out.println("Interface hoon mai");
    }
    default void run(){
        System.out.println("Run function from interface");
    }
}
