package md.tekwill;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Exercise8 {

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();

        names.add("Tom");
        names.add("Jerry");
        names.add("Bob");
        names.add("Mickey");

        /* Using ArrayList methods:
         *
         * TASK 1:
         *  Print the nr. or elements in the list
         */
            System.out.println("#1_ size - " + names.size());
         /* TASK 2:
         *  Verify print if the list contains "Jerry"
         */
            System.out.println("#2_ contains Jerry? - " + names.contains("Jerry"));
         /* TASK 3:
         *   Get and print the index of "Bob" element
         */
            System.out.println("#3_ index of element <Bob> - " + names.indexOf("Bob") );

         /* TASK 4:
         *   Print the last element of the list
         */
            System.out.println("#4_ last element - "+ "<" + names.get(names.size()-1) + ">");
         /* TASK 5:
         *   Remove "Bob" and print the remaining elements
         */
            System.out.println("#5_ <Bob> removed ? - " + names.remove("Bob"));
            System.out.println("#5_ Names list: " + names);
         /* TASK 6****:
         *   Sort the list and then print it
         */
//      names.sort();
//      System.out.println("#6_ " + names);
         /* TASK 7:
         *   Insert your name as 2nd element then print the list
         */
         names.add(1,"Seioga");
            System.out.println("#7_ new list: " + names);
    }
}
