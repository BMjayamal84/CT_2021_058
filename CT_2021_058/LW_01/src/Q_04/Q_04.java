package Q_04;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class Q_04 {
    public static void main(String[] args) {
        LocalDate todayDate = LocalDate.now();
        DateTimeFormatter myFormat = DateTimeFormatter.ofPattern("dd MMM yyyy");

        System.out.println(todayDate.format(myFormat));
    }
}
