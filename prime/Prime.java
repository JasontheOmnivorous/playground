package prime;

import java.util.Scanner;

public class Prime {
    public static boolean primeOrNot(int num) {
        if (num <= 1) return false;

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();

        if (primeOrNot(num) == true) {
            System.out.println("The number is a prime number.");
        } else {
            System.out.println("The number is not a prime number.");
        }
    }
}
