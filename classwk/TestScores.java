package classwk;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TestScores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t;
        System.out.print("Enter number of test cases: ");
        t = sc.nextInt();
        sc.nextLine(); // consume newline

        for (int i = 0; i < t; i++) {
            System.out.print("Enter username: ");
            String username = sc.nextLine();
            System.out.print("Enter marks: ");
            try {
                int marks = sc.nextInt();
                sc.nextLine(); // consume newline

                if (marks < 0 || marks > 100) {
                    throw new Exception("Score out of range");
                }

                System.out.println("Correct");
            } catch (InputMismatchException e) {
                System.out.println("Not a digit");
                sc.nextLine(); // Clear the invalid input
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        sc.close();
    }
}
