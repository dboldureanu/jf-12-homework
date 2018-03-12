package md.tekwill;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Exercise3 {

    public static void main(String[] args) {
        // Print the current date using
        // LocalDate.format in the following format:
        // DD.MM.YYYY - 12.04.1961

        LocalDate currentDate = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("DD.MM.YYYY");
        String formattedDate = currentDate.format(formatter);
        System.out.println(formattedDate);
    }
}
