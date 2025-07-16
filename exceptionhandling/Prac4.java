package exceptionhandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Prac4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        for (int i = 0; i < 7; i++) {
            try {
                int value = sc.nextInt();
                arr[i] = value;
            } catch (InputMismatchException ex) {
                throw new InputMismatchException(ex.getMessage());
            } catch (ArrayIndexOutOfBoundsException ex) {
                throw new ArrayIndexOutOfBoundsException(ex.getMessage());
            }
        }
        sc.close();
    }
}
