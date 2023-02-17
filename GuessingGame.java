import java.util.Scanner;
import java.util.Random;

public class GuessingGame {
    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);

        //choose a random numbr from 0 - 100
        int correctNumber = (int) (Math.random() * 100);

        //Ask the user to guess a random number from 0 to 100
        //Get the first guess uding scan.nextInt();

        System.out.println("Guss a number between 0 and 100");
        int guess = scan.nextInt();

        //Loop while the guess does not equal the random number,
            //If the guess is less than the random number, print out "Too low!"
            //If the guess is greatr than the random number, print out "Too high!"
            //Get a new guess (save it into the same variable)
        
            while (guess != correctNumber)
        {
            if (guess > correctNumber)
            {
                System.out.println("Too high!");
            }
            if (guess < correctNumber)
            {
                System.out.println("Too low!");
            }

            guess = scan.nextInt();
        } 

        //Print out something like "You got it!"
        System.out.println("You got it!");
    }
}
