package Q_07;

import javax.swing.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Q_07 {
    public static void main(String[] args) {
        LocalDateTime currentTime = LocalDateTime.now();
        DateTimeFormatter newTimeFormat = DateTimeFormatter.ofPattern("HH:mm:ss a");

        JFrame frame = new JFrame();
        frame.setSize(800,600);
        frame.setTitle(currentTime.format(newTimeFormat));
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
