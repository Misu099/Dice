import java.util.Scanner;

public class DiceGame {
    private int wins;
    private int loses;
    private int draws;
    private boolean playAgain = true;
    private final Dice dice = new Dice();
    private final Scanner scan = new Scanner(System.in);

    public void play() {
        int userDice;
        int computerDice;
        float wrRatio;

        while (playAgain) {

            System.out.println("User Dice: ");
            userDice = dice.play();

            System.out.println("Computer Dice: ");
            computerDice = dice.play();

            if (userDice > computerDice) {
                System.out.println("User win!");
                wins++;
            } else if (userDice < computerDice) {
                System.out.println("Computer win!");
                loses++;
            } else {
                System.out.println("It's a draw!");
                draws++;
            }

            if (wins == 0) {
                wrRatio = 0;
            } else if (loses == 0) {
                wrRatio = wins;
            } else {
                wrRatio = (float) wins / loses;
            }

            System.out.println("User stats: WINS:" + wins + " LOSES:" + loses + " DRAWS:" + draws);
            System.out.println("            W/R RATIO " + wrRatio);

            System.out.println("Play again? (YES for it, anything else to exit)");

            if (scan.nextLine().trim().equalsIgnoreCase("yes")) {
                playAgain = true;
            } else {
                playAgain = false;
                scan.close();


            }
        }
    }


}
