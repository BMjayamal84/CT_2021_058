package Q_04;

import java.util.Scanner;

public class Q_04 {
    public static void main(String[] args) {
        double cal_input;
        double calsNeeded;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the Weight:");
        cal_input = scanner.nextDouble();

        calsNeeded =  cal_input * 32;

        System.out.println("You need "+ calsNeeded + " Calories in one day");

    }
}
