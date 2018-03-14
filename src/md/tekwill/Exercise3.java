package md.tekwill;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Exercise3 {

    public static void main(String[] args) {

        // Print the current date using
        // LocalDate.format in the following format:
        // DD.MM.YYYY - 12.04.1961

        LocalDate today = LocalDate.now();  //->2018-03-14
        DateTimeFormatter dateNewFormat = DateTimeFormatter.ofPattern("dd.MM.YYYY"); // DD -> No. of day
                System.out.println(today.format(dateNewFormat));
    }


}
