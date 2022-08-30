package lottery;

import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class app {
        
        public static void main(String[] args) {
            

            Scanner input = new Scanner(System.in);
            
            Random number = new Random(); // creating Random object
            int[] array = new int[7];
            String user = "";

            do {
            for (int i = 0; i < array.length; i++) {

                array[i] = number.nextInt(40); // storing random integers in an array
         
            }
                System.out.println(Arrays.toString(array));
                System.out.println("Do you want to see another set of lottery numbers? (y/n)");
                user = input.next();
                
            } while (!user.equals("n"));                     
        
            input.close();

            }
            
    }
    