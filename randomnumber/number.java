package randomnumber;
import java.util.Scanner;
import java.util.Random;

public class number {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Guess a number, please");
        int attempt = input.nextInt();
        Random generator = new Random();
        int number;
        number = generator.nextInt(10) + 1;
        int guesses = 0;

       while (number > attempt) 
       {
           System.out.println("Guess again, a randomized number is bigger");
           attempt = input.nextInt();
           guesses++;
       }

       while (number < attempt)
       {
           System.out.println("Guess again, a randomized number is smaller");
           attempt = input.nextInt();
           guesses++;
       }

       if (number == attempt)
       {

           guesses++;
       }


       System.out.println("Congratulations, your guess is correct, the number was " + number + " and you guessed it in " + guesses + " tries");

       input.close();
    }  

}
