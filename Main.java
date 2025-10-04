// import java.util.*;

// class InvalidCoffeeCodeException extends Exception {
//     public InvalidCoffeeCodeException(int code) {
//         super("Invalid Coffee code : " + code);
//     }
// }

// class MachineOverloadException extends Exception {
//     public MachineOverloadException() {
//         super("Machine Overload! Cannot process more than 3 orders at once.");
//     }
// }

// class OutOfBeansException extends Exception {
//     public OutOfBeansException() {
//         super("Out of beans! Daily limit reached.");
//     }
// }

// class SmartCoffeeMachine {
//     static int total = 0;
//     static final int daily_LIMIT = 10;

//     public static void brewCoffee(List<Integer> lst) throws Exception{
//         if (lst.size() > 3) {
//             throw new MachineOverloadException();
//         }
//         for (int num : lst) {
//             if (num > 5 || num < 1) {
//                 throw new InvalidCoffeeCodeException(num);
//             }
//             if (total >= daily_LIMIT) {
//                 throw new OutOfBeansException();
//             }
//             total++;
//             System.out.println("Brewed Coffee : " + num);
//         }

//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         List<Integer> codes = new ArrayList<>();
//         for (int i = 0; i < n; i++) {
//             codes.add(sc.nextInt());
//         }

//         try {
//             SmartCoffeeMachine.brewCoffee(codes);
//         } catch (Exception e) {
//             System.out.println(e.getMessage());
//         } finally {
//             System.out.println("Machine shutting down...");
//         }
//         sc.close();
//     }
// }
import java.util.*;

class Student {
    String name;
    int age;
    int marks;

    Student(String name, int age, int marks) {
        this.name = name;
        this.age = age;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return name + " " + age + " " + marks;
    }
}

public class Main {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student("Amit", 20, 85));
        list.add(new Student("Ravi", 22, 90));
        list.add(new Student("Ravi", 22, 69));
        list.add(new Student("Zoya", 18, 95));

        Comparator<Student> cmp = Comparator
                .comparing((Student s) -> s.name)
                .thenComparing(s -> s.age)
                .thenComparing(s -> s.marks);

        Collections.sort(list, cmp);

        for (Student s : list) {
            System.out.println(s);
        }
    }
}
