package validIntegerInput;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ValidIntegerInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean validInput = false;
        int userInput = 0;

        while(!validInput) {
            try {
                System.out.println("Enter an integer: ");
                userInput = sc.nextInt();
                validInput = true;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter an integer.");
                sc.nextLine();
            }
        }

        System.out.println("You entered: " + userInput);
        sc.close();
    }
}
