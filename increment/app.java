package increment;
import java.util.Scanner;

public class app {
    
    public static void main(String[] args) {
        
        int inputs = 0;
        int userNumber = 0;
        int sum = 0;

       Scanner input = new Scanner(System.in);

        do {
            System.out.println("Please give a number: ");
            userNumber = input.nextInt();
            inputs++;
            sum += userNumber;

        } while (sum <= 30);
            
        

   input.close();
        
        System.out.println("You entered " +inputs+ " numbers and the sum of the numbers is: " +sum);
   }
}
