package javacoursework1;

import java.util.Scanner;

public class one {

    public static void main(String args[])
    {
        int trial = 1;
        int GuessNumber = 0;
        int secret = (int) (Math.random() * 99 + 1);
        Scanner userInput = new Scanner(System.in);
        System.out.println("Hello,Welcome to Guess Number Game\n there are only 10 attempts. ");
        do {
            System.out.print(" JUst guess a number between 1 to 100\n");
            if(userInput.hasNextInt()) {
                GuessNumber = userInput.nextInt();
                if (GuessNumber == secret)
                {    
                    System.out.println("OOhhOO!, Your Number is Correct. You Win the Game!");
                    break;
                }
                else if (GuessNumber < secret)
                    System.out.println("The number guessed  is Smaller.");
                else if (GuessNumber > secret)
                    System.out.println("The number guessed is Greater.");
                if(trial == 5) {
                    System.out.println("You have exceeded the maximum attempt. Try Again");
                    break;
                }
                trial++;
            }else {
                System.out.println("Enter a Valid Integer Number");
                break;
            }
        } while (GuessNumber != secret);
    }
}	 



