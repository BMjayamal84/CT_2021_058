package Q_08;

import java.util.Scanner;

public class Q_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Sentence that contains a single exclamation mark:");
        String sentence = scanner.nextLine();
        String[] newArraySent = sentence.split("!");
        for (String s:newArraySent){
            System.out.println(s);
        }
    }
}
