package temperature;

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Temperature in Celcius:\n");
        double celcius = sc.nextDouble();
        sc.close();

        System.out.println("Temperature in Fahrenheit is " + ((celcius * 9/5) + 32));
    }
}
