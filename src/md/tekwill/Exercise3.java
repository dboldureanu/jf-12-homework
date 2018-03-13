package md.tekwill;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Exercise3 {

    public static void main(String[] args) {
        // Print the current date using
        // LocalDate.format in the following format:
        // DD.MM.YYYY - 12.04.1961
        String format = LocalDate.now().format(DateTimeFormatter.ofPattern("dd.MM.YYYY"));
        System.out.println(format);
    }
}
