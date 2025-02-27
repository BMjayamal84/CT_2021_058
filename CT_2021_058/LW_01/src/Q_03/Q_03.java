package Q_03;

import java.util.Scanner;

public class Q_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your First name:");
        String firstName = scanner.next();
        System.out.print("Enter your First name:");
        String middleName = scanner.next();
        System.out.print("Enter your Last name:");
        String lastName = scanner.next();

        System.out.println(firstName + " " + middleName.charAt(0) + ". " + lastName );

    }

}
