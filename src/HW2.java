import java.util.InputMismatchException;
import java.util.Scanner;

public class HW2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Task №2");
        try {
            System.out.print("Enter the first integer: ");
            int a = sc.nextInt();
            System.out.print("Enter the second integer: ");
            int b = sc.nextInt();
            divide(a, b);
        } catch (InputMismatchException e1) {
            System.out.println("Error: incorrect input. Enter integers!");
        } catch (DivisionByZeroException e2) {
            System.out.println(e2.getMessage());
        }
    }

    public static void divide(int a, int b) throws DivisionByZeroException {
        if (b == 0) {
            throw new DivisionByZeroException("Error: incorrect input. Enter integers!");
        } else {
            System.out.println(a / b);
        }
    }

    static class DivisionByZeroException extends Exception {
        public DivisionByZeroException(String message) {
            super(message);
        }
    }
}