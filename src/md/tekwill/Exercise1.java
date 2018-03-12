package md.tekwill;

import java.time.LocalDate;

public class Exercise1 {

    public static void main(String[] args) {
        // Create a LocalDate for your birth day,
        // then print the day of week
        LocalDate birthDay = LocalDate.of(1995, 4, 8);
        System.out.println(birthDay.getDayOfWeek());
    }
}
