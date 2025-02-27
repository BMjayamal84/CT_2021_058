package Q_06;

import javax.swing.*;
import java.util.Scanner;

public class Q_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Title: ");
        String title = scanner.nextLine();
        System.out.print("Enter the Width: ");
        int width = scanner.nextInt();
        System.out.print("Enter the Height: ");
        int height = scanner.nextInt();

        JFrame frame = new JFrame();
        frame.setSize(width,height);
        frame.setTitle(title);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }
}
