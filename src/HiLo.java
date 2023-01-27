import java.util.Scanner;


public class HiLo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String playAgain = "";
        do {
            int winningNumber = (int)(Math.random() * 100 + 1);
            int guess = 0;
            int count = 0;
            while (guess != winningNumber)  {
                System.out.println("Guess a number between 1 and 100");
                guess = scan.nextInt();
                System.out.println("You entered " + guess + ".");
                if (guess < winningNumber) {
                    System.out.println(guess + " is too low. Try again.");
                } else if (guess > winningNumber) {
                    System.out.println(guess + " is too high. Try again.");
                } else {
                    System.out.println(guess + " is Correct! You Win");
                    System.out.println("Number of attempts: " + count);
                }
                count ++;
            }
            System.out.println("Would you like to play again (y/n)?");
            playAgain = scan.next();
        } while (playAgain.equalsIgnoreCase("y"));

        System.out.println("Thank you Playing!");
    }
}