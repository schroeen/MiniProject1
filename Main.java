/*
Mini Project 1
Group #8: Evan Schroeder, Damandeep Kaur, Jacob Knapke 
Date: 9/24/20
*/
import java.util.Random;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    System.out.println("Welcome to the Guessing Game!");
    Scanner s = new Scanner(System.in);
    
    Random r = new Random();

    int num;
    int guess;
    int tries=1;
    System.out.println("Please enter any positive whole number: ");
     num = s.nextInt();

    int randomNum = r.nextInt(num)+1;

    System.out.println("A random number to guess has been generated");
    playGame(randomNum, num);
    guess = s.nextInt();
    
    while (guess != randomNum) {
      
      if (guess>randomNum)
      {
        System.out.println("Guess lower!");
        System.out.println("Enter your new guess: ");
      }
      else if (guess<randomNum) 
      {
        System.out.println("Guess higher!");
        System.out.println("Enter your new guess: ");
      }
      guess = s.nextInt();
      tries++;
    }
    System.out.println("Great, you win! It took you "+ tries +" tries"); 
  }


  static void playGame(int theRN, int theNum)
  {
    System.out.println("Please guess a number between 0 and "+theNum);
  }
  
}