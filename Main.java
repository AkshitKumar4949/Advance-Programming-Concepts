import java.util.*;

class InvalidCoffeeCodeException extends Exception {
    public InvalidCoffeeCodeException(int code) {
        super("Invalid Coffee code : " + code);
    }
}

class MachineOverloadException extends Exception {
    public MachineOverloadException() {
        super("Machine Overload! Cannot process more than 3 orders at once.");
    }
}

class OutOfBeansException extends Exception {
    public OutOfBeansException() {
        super("Out of beans! Daily limit reached.");
    }
}

class SmartCoffeeMachine {
    static int total = 0;
    static final int daily_LIMIT = 10;

    public static void brewCoffee(List<Integer> lst) throws Exception{
        if (lst.size() > 3) {
            throw new MachineOverloadException();
        }
        for (int num : lst) {
            if (num > 5 || num < 1) {
                throw new InvalidCoffeeCodeException(num);
            }
            if (total >= daily_LIMIT) {
                throw new OutOfBeansException();
            }
            total++;
            System.out.println("Brewed Coffee : " + num);
        }

    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> codes = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            codes.add(sc.nextInt());
        }

        try {
            SmartCoffeeMachine.brewCoffee(codes);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Machine shutting down...");
        }
        sc.close();
    }
}