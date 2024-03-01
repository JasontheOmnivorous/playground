package divisionProgram;

import java.util.Scanner;

public class DivisionProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter the divided: ");
            int dividend = sc.nextInt();

            System.out.println("Enter the divisor: ");
            int divisor = sc.nextInt();

            int result = dividend / divisor;
            System.out.println("Result of division: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        } catch (java.util.InputMismatchException e) {
            System.out.println("Error: Please enter valid integers.");
        } finally {
            sc.close();
            System.out.println("Thank you for using the division program.");
        }
    }
}
