package Q_05;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Q_05 {
    public static void main(String[] args) {
        LocalDate todayDate = LocalDate.now();
        DateTimeFormatter myFormat = DateTimeFormatter.ofPattern("EEEE, MMMM dd, yyyy");

        System.out.println(todayDate.format(myFormat));
    }
}
