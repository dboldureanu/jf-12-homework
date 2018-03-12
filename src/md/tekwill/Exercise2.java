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
        LocalDate of = LocalDate.of(Integer.parseInt(args[2]), Integer.parseInt(args[1]), Integer.parseInt(args[0]));
        System.out.println(of);
    }
}
