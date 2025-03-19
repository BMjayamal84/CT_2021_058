package Q_06;

import java.util.Scanner;

public class Q_06 {
    public static void main(String[] args) {
        int bornYear;
        int age;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your birth year:");
        bornYear = scanner.nextInt();

        age = 2025 - bornYear;

        System.out.println("You were born in "+bornYear+" and will be "+age+" this year.");

    }
}
