package oblig2;
import java.util.Scanner;

public class Oppgave2 {
    // Java program for the above approach

        // Function that implements the
    public static void
    guessingNumberGame()
    {
            // Scanner Class
            Scanner sc = new Scanner(System.in);

            // Generate the numbers
            int number = 0 + (int)(200
                    * Math.random());

            // Given K trials
            int K = 5;

            int i, guess;

            System.out.println(
                    "Et tilfeldig tall "
                            + " mellom 0 og 200."
                            + "Tipp tallet"
                            + " within 5 trials.");

            // Iterate over K Trials
            for (i = 0; i < K; i++) {

                System.out.println(
                        "Guess the number:");

                // Take input for guessing
                guess = sc.nextInt();

                // If the number is guessed
                if (number == guess) {
                    System.out.println(
                            "Congratulations!"
                                    + " You guessed the number.");
                    break;
                }
                else if (number > guess
                        && i != K - 1) {
                    System.out.println(
                            "The number is "
                                    + "greater than " + guess);
                }
                else if (number < guess
                        && i != K - 1) {
                    System.out.println(
                            "The number is"
                                    + " less than " + guess);
                }
            }

            if (i == K) {
                System.out.println(
                        "You have exhausted"
                                + " K trials.");

                System.out.println(
                        "The number was " + number);
            }
        }

        // Driver Code
        public static void
        main(String arg[])
        {

            // Function Call
            guessingNumberGame();
        }
    }