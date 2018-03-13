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
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        for(int i = 1; i <= n; i++) {
            for(int j = 0; j < (m * 5); j++) {
                System.out.print("-");
            }
            System.out.println();
            System.out.print("| ");
            for(int j = 1; j <= m; j++) {
                System.out.print((i  * j) + " | ");
            }
            System.out.println();
        }
    }
}
