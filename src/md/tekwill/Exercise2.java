package md.tekwill;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Exercise2 {

    public static void main(String[] args) {
        // Read a date from input arguments,
        // and create a LocalDate out of them.
        // First argument - day
        // Second argument - month
        // Third argument - year

        // Print the day of year (1 - 365)

        Scanner dateInput = new Scanner(System.in);
        System.out.println("Input your date in format YYYY-MM-dd: ");        //->30 10 1983s
     /*
        int day = Integer.parseInt(dateIpmut[0]);
        int month = Integer.parseInt(dateIpmut[1]);
        int year = Integer.parseInt(dateIpmut[2]);
    */
        LocalDate yourDate = LocalDate.parse(dateInput.nextLine());


       // DateTimeFormatter nomberOfDay = DateTimeFormatter.ofPattern("DD");
        System.out.println("Your date is " + yourDate.getDayOfYear() +" day of year");  //-> nomber of day

    }
}
