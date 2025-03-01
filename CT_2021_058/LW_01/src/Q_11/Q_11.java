package Q_11;

import java.util.Scanner;

public class Q_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Your full name in the format first middle last :");
        String userInput = scanner.nextLine();
        String[] nameArray = userInput.split(" ");

        String firstName = nameArray[0];
        String middleChar = String.valueOf(nameArray[1].charAt(0));
        String lastName = nameArray[2];

        System.out.println(lastName + ", " + firstName + " " + middleChar + ".");

    }

}
