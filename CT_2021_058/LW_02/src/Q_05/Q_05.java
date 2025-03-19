package Q_05;

import java.util.Scanner;

public class Q_05 {
    public static void main(String[] args) {
        double celsius;
        double fahrenheit;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the temperature in degrees Fahrenheit:");
        fahrenheit = scanner.nextDouble();

        celsius =  ((double) 5 /9)*(fahrenheit - 32);

        System.out.println(celsius);

    }
}
