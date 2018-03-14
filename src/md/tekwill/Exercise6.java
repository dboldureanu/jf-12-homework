package md.tekwill;

import java.util.Scanner;

public class Exercise6 {

    public static void main(String[] args) {
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
        Scanner symbol_1 = new Scanner(System.in);
        System.out.println("Type your symbol_1: ");
        String sym_1 = symbol_1.next();

            for(int a = 0; a < 4; a++){
                for (int s = 0; s <= a; s++){
                    System.out.print(sym_1);
                }
            System.out.println();
            }
        System.out.println();

        Scanner symbol_2 = new Scanner(System.in);
        System.out.println("Type your symbol_2: ");
        String sym_2 = symbol_2.next();

        for(int b = 0; b < 4; b++){
            for (int n = 4; n > b; n--){
                System.out.print(sym_2);
            }
            System.out.println();
        }
        System.out.println();

        Scanner symbol_3 = new Scanner(System.in);
        System.out.println("Type your symbol_2: ");
        String sym_3 = symbol_3.next();

        for(int c = 0; c < 4; c++){
            for (int v = 4; v > c; v--){
                System.out.print(" ");
            }
                for(int v = 4; v > c; v--){
                    System.out.print(sym_3+" ");
                }
            System.out.println();
        }
    }
}

