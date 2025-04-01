package Q_01_02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double celsius;
        temperature temp1 = new temperature();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the Temperature in Celsius: ");
        celsius = scanner.nextDouble();

        temp1.setFahrenheit(celsius);
        System.out.println(celsius + " in celsius = " + temp1.getFahrenheit() + " in fahrenheit");

        double fahrenheit;
        temperature temp2 = new temperature();

        System.out.print("Enter the Temperature in Fahrenheit: ");
        fahrenheit = scanner.nextDouble();

        temp2.setCelsius(fahrenheit);
        System.out.println(fahrenheit + " in fahrenheit = " + temp2.getCelsius() + " in celsius");

    }
}
