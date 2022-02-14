package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	/* Create a new project named NumberGuess
        --targetNumber and assign between 1 and 10
        --While loop - get user input to guess a number
        --if targetNumber = input --> congratulate and end loop
        --if not, loop until correct number
        --Bonus: find a way to assign a random number between 1 and 10
        --Super Bonus: if the user inputs a number that is not between 1 and 10, Tell them number is invalid and ask for
        for another number

	 */
        int targetNumber = 5;
        int usrGuess;
        Scanner usrInput = new Scanner(System.in);
        System.out.println("Enter a number between 1 and 10");
        usrGuess = usrInput.nextInt();
        boolean stillGuessing = true;

        while(stillGuessing == true)
        {

            if(usrGuess == targetNumber)
            {
                System.out.println("Congratulations");
                break;
            }
            else
            {
                System.out.println("Enter a number between 1 and 10");
                usrGuess = usrInput.nextInt();
            }


        }
    }
}
