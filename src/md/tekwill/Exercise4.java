package md.tekwill;

public class Exercise4 {

    private static int FIRST_NAME = 0;
    private static int LAST_NAME = 1;

    public static void main(String[] args) {
        String actors[][] = new String[4][2];

        actors[0][0] = "Tom";
        actors[0][1] = "Cruise";

        actors[1][0] = "Robert";
        actors[1][1] = "Downey";

        // Compare the lines bellow with the above ones
        // Those bellow are more readable, isn't it?
        actors[2][FIRST_NAME] = "Tom";
        actors[2][LAST_NAME] = "Hanks";

        actors[3][FIRST_NAME] = "Dwayne";
        actors[3][LAST_NAME] = "Johnson";

        // TASK:
        // Print the name of the actors:
        // Tom Cruise
        // Robert Downey
        // etc.
        for(String[] actor: actors) {
            System.out.println(actor[0] + " " + actor[1]);
        }
    }
}
