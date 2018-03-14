package md.tekwill;

import java.util.Scanner;

public class Exercise7 {

    public static void main(String[] args) {
        /*
        * Read 2 integers using keyboard.
        * First integer is the nr or rows
        * Second integer is the nr of columns
        * TASK:
        *   Using the standard for loop, print a table
        *   containing in its cell the product of the column
        *   and row (index + 1).
        * EXAMPLE:
        *   3
        *   2
        *
        *   ---------
        *   | 1 | 2 |
        *   ---------
        *   | 2 | 4 |
        *   ---------
        *   | 3 | 6 |
        * */
        int columns = 0 , rows = 0;
        Scanner in = new Scanner(System.in);
            System.out.println("Number of rows: ");
        rows = in.nextInt();
            System.out.println("Number of columns");
        columns = in.nextInt();

        for(int r = 0 ; r < rows; r++){
            if(r > 0) {
                System.out.print("|");
            }
                System.out.println();
            for(int k = 0 ; k < columns; k++){
                System.out.print("----");
            }
        System.out.println();

            for(int j = 0 ; j < columns ; j++){
                 System.out.print("| " + (r + 1) * (j + 1) + " ");
                if(j == columns-1 && r == rows-1)
                    System.out.print("|");
            }
        }
    }

}
