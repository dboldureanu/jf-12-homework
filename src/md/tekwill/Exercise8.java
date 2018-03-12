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

        System.out.println("Task №1");
        System.out.println("The number of elements in the list is " + names.size());

        System.out.println("\nTask №2");
        String checkName = (names.contains("Jerry")) ? "Jerry is" : "no Jerry isn`t";

        System.out.println(checkName + " in the list");

        System.out.println("\nTask №3");
        System.out.println(names.indexOf("Bob"));

        System.out.println("\nTask №4");
        System.out.println(names.get(names.size()-1));

        System.out.println("\nTask №5");
        names.remove("Bob");
        System.out.println(names);

        System.out.println("\nTask №6");
        Collections.sort(names);
        System.out.println(names);

        System.out.println("\nTask №7");
        names.add(1,"Vlad");
        System.out.println(names);
        /* Using ArrayList methods:
         *
         * TASK 1:
         *  Print the nr. or elements in the list
         *
         * TASK 2:
         *   Verify print if the list contains "Jerry"
         *
         * TASK 3:
         *   Get and print the index of "Bob" element
         *
         * TASK 4:
         *   Print the last element of the list
         *
         * TASK 5:
         *   Remove "Bob" and print the remaining elements
         *
         * TASK 6****:
         *   Sort the list and then print it
         *
         * TASK 7:
         *   Insert your name as 2nd element then print the list
         */
    }
}
