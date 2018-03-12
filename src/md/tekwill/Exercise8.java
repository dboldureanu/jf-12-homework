package md.tekwill;

import java.util.ArrayList;
import java.util.Collections;

public class Exercise8 {

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();

        names.add("Tom");
        names.add("Jerry");
        names.add("Bob");
        names.add("Mickey");


         // TASK 1:
         //  Print the nr. or elements in the list
        System.out.println(names.size());
         // TASK 2:
         //   Verify print if the list contains "Jerry"
        System.out.println(names.contains("Jerry"));
         // TASK 3:
         //   Get and print the index of "Bob" element
        System.out.println(names.indexOf("Bob"));
         // TASK 4:
         //   Print the last element of the list
        System.out.println(names.get(names.size() - 1));
         // TASK 5:
         //   Remove "Bob" and print the remaining elements
         names.remove("Bob");
        System.out.println(names);
         // TASK 6****:
         //   Sort the list and then print it
        Collections.sort(names);
        System.out.println(names);
         // TASK 7:
         //   Insert your name as 2nd element then print the list
         ///
        names.add(1, "Luca");
        System.out.println(names);
    }
}
