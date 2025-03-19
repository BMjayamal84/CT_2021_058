package Q_02;

import java.util.Scanner;

public class Q_02 {
    public static void main(String[] args) {
        double cm_input;
        int feet;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value in centimeters:");
        cm_input = scanner.nextDouble();

        double inches =  (cm_input/2.54);
        double new_Inches;
        if (inches > 12){
            feet = (int)(inches / 12);
            new_Inches = (inches % 12);
            System.out.println(cm_input + " in centimeter = "+ feet + " feet and " + new_Inches + " inches.");

        } else {
            System.out.println(cm_input + " in centimeter = "+ inches + " Inches.");
        }



    }
}
