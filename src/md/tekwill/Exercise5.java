package md.tekwill;

public class Exercise5 {

    private static int FIRST_NAME = 0;
    private static int LAST_NAME = 1;

    public static void main(String[] args) {
        String actors[][] = new String[4][2];

        actors[0][FIRST_NAME] = "Tom";
        actors[0][LAST_NAME] = "Cruise";

        actors[1][FIRST_NAME] = "Robert";
        actors[1][LAST_NAME] = "Downey";

        actors[2][FIRST_NAME] = "Tom";
        actors[2][LAST_NAME] = "Hanks";

        actors[3][FIRST_NAME] = "Dwayne";
        actors[3][LAST_NAME] = "Johnson";

        // TASK:
        // Determine, then print the last lexicographically actor name:
        // OUTPUT: Tom Hanks
    }
}
