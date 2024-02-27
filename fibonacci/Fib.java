package fibonacci;

import java.util.Scanner;

public class Fib {
    public static long fibonacci(int n) {
        double sqrt5 = Math.sqrt(5);
        double phi = (1 + sqrt5) / 2;
        double psi = (1 - sqrt5) / 2;

        return Math.round((Math.pow(phi, n) - Math.pow(psi, n)) / sqrt5);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n to find the nth Fibonacci number: ");
        int n = sc.nextInt();
        sc.close();

        long fibN = fibonacci(n);
        System.out.println("The " + n + "th Fibonacci number is: " + fibN);
    }
}
