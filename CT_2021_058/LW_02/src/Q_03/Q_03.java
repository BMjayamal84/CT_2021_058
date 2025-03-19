package Q_03;

import java.util.Scanner;

public class Q_03 {
    public static void main(String[] args) {
        double cel_input;
        double fahrenheit;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the temperature in degrees Celsius:");
        cel_input = scanner.nextDouble();

        fahrenheit =  (1.8*cel_input) + 32;

        System.out.println(fahrenheit);

    }
}
