package md.tekwill;

import java.time.LocalDate;

public class Exercise2 {

    public static void main(String[] args) {
        // Read a date from input arguments,
        // and create a LocalDate out of them.
        // First argument - day
        // Second argument - month
        // Third argument - year

        // Print the day of year (1 - 365)

        int day = Integer.parseInt(args[0]);
        int month = Integer.parseInt(args[1]);
        int year = Integer.parseInt(args[2]);

        LocalDate someDate = LocalDate.of(year,month,day);

        System.out.println(someDate);
    }
}
