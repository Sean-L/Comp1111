// ************************************************************
// Guess.java
//
// Play a game where the user guesses a number from 1 to 10
//
// ************************************************************
import java.util.Scanner;
import java.util.Random;
public class Guess
{
public static void main(String[] args)
{
    int numToGuess; //Number the user tries to guess
    int guess; //The user's guess
    int badguess = 1;
    int highguess= 0;
    int lowguess= 0;
    Scanner scan = new Scanner(System.in);
    Random generator = new Random();
    numToGuess = generator.nextInt(10) + 1; 

//randomly generate the number to guess
    System.out.println("Please try to guess a number between 1 and 10 inclusive:");
    guess = scan.nextInt();
    //print message asking user to enter a guess
    //read in guess
    if (guess == numToGuess)
    {
        System.out.println("CONGRATULATIONS A WINNER IS YOU!");}
            
            while (guess != numToGuess)//keep going as long as the guess is wrong
                {
                    if (guess != numToGuess){
                        badguess++;
                        if (guess < numToGuess){
                            lowguess++;
                        }
                    if (guess > numToGuess){
                         highguess++;
                    }
                        }
                System.out.println("Try again dork!");{
                guess=scan.nextInt();}
                }
                if(guess == numToGuess)
                {
                System.out.println("CONGRATULATIONS A WINNER IS YOU!");
                System.out.println("It took you " +badguess +" tries");
                System.out.println(lowguess +" of your guesses were too low.");
                System.out.println(highguess +" of your guesses were too high.");
                }
            
     scan.close();
//print message saying guess is wrong
//get another guess from the user
}
//print message saying guess is right
}
