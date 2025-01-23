import java.util.*;

class Guess {
    public static void main(String[] args) {

        // generate secret number
        // Using a new object random to make a random integer
        Random ram = new Random();
        int secretNum = ram.nextInt(1,11);

        int numGuesses = 0;
        int guess = 0;

        while (guess != secretNum) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter your guess: ");
            guess = scan.nextInt();
            numGuesses++;

            // Give feed back on guess
            if (guess < secretNum) {
                System.out.println("Your guess is too low.");
            } else if (guess > secretNum) {
                System.out.println("Your guess is too high.");
            } else {
                System.out.println("You got it!!");
            //  System.out.println("The secretNum is 0")
            }

        }
        System.out.println("It took you " + numGuesses + " guesses.");
    }
}
