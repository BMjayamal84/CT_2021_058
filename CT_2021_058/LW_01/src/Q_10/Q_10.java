package Q_10;

import java.util.Scanner;

public class Q_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the odd-length word:");
        String userInput = scanner.next();
        int inputCount = userInput.length();
        int middleNum = inputCount/2;
        System.out.println(userInput.charAt(middleNum));
    }
}
