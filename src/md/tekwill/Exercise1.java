package md.tekwill;

import java.time.LocalDate;

public class Exercise1 {

    public static void main(String[] args) {
        // Create a LocalDate for your birth day,
        // then print the day of week
        LocalDate myDateOfBirthDay = LocalDate.of(1983, 10,30);
        System.out.println(myDateOfBirthDay.getDayOfWeek());
    }
}
