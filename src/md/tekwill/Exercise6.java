package md.tekwill;

import java.util.Scanner;
import java.util.function.BiPredicate;
import java.util.function.Consumer;

public class Exercise6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String c = scanner.nextLine();
        int n = scanner.nextInt();

        printPattern(c, n, (i, j) -> i >= j, s -> {});
        System.out.println("-----------------------");
        printPattern(c, n, (i, j) -> i <= j, s -> {});
        System.out.println("-----------------------");
        printPattern(c, n, (i, j) -> i <= j, s -> System.out.print(" "));
    }

    static void printPattern(String c, int size, BiPredicate<Integer, Integer> rule, Consumer<String> consumer) {
        int i = 0;
        int j = 0;
        while(i < size) {
            while (j < size) {
                if(rule.test(i, j)) {
                    System.out.print(c + " ");
                } else {
                    consumer.accept(" ");
                }
                j++;
            }
            i++;
            j = 0;
            System.out.println();
        }
    }
}
