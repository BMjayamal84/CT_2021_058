package Q_02;

import javax.swing.*;
import java.util.Scanner;

public class Q_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your First name:");
        String firstName = scanner.next();
        System.out.print("Enter your Last name:");
        String lastName = scanner.next();

        JFrame myWindow;
        myWindow = new JFrame();
        myWindow.setSize(800, 600);
        myWindow.setTitle(firstName + " " + lastName);
        myWindow.setVisible(true);
    }
}
