package md.tekwill;

import java.util.Scanner;

public class Exercise6 {

    public static void main(String[] args) {

        char yourChar;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the character");
        yourChar = in.next().charAt(0);

        for(int rows = 0 ; rows < 5 ; rows++)
        {
            for(int columns = 0 ; columns < rows ; columns++)
                System.out.print(yourChar);

            System.out.println("");
        }
        System.out.println("");
        for(int rows = 0 ; rows < 5 ; rows++)
        {
            for(int columns = 4 ; columns > rows ; columns--)
                System.out.print(yourChar);

            System.out.println("");
        }

        System.out.println("");

        for(int i=4;i>0;i--) {
            for(int j=0;j<4-i;j++) {
                System.out.print(" ");
            }
            for(int k=0;k<i;k++) {
                System.out.print(yourChar+" ");
            }
            System.out.println();
        }
        /* Read a character from keyboard.
         * Using while loop print triangles:
         *
         * a)
         *  INPUT $
         *  OUTPUT
         *  $
         *  $$
         *  $$$
         *  $$$$
         *
         * b)
         *  INPUT $
         *  OUTPUT
         *  $$$$
         *  $$$
         *  $$
         *  $
         *
         *  c)
         *  INPUT $
         *  OUTPUT
         *  $ $ $ $
         *   $ $ $
         *    $ $
         *     $
         * */
    }
}
