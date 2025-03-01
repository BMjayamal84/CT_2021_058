package Q_09;

import java.util.Scanner;

public class Q_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the text:");
        String userInput = scanner.nextLine();
        int inputCount = userInput.length();
        char firstChar = userInput.charAt(0);
        char lastChar = userInput.charAt(inputCount-1);

        System.out.println(inputCount);
        System.out.println(firstChar);
        System.out.println(lastChar);
    }




}
