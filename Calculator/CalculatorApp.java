import java.util.Scanner;

public class CalculatorApp {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int number = input.nextInt();
        System.out.println("Please enter another number: ");
        int number2 = input.nextInt();
        System.out.println("Please enter an operator: ");
        String operator = input.next();
 
        if (operator.equals("+")) {
            System.out.println("tulos: " +number + operator + number2 + " = " + (number + number2));
        } else if (operator.equals("-")) {
            System.out.println("tulos: " +number + operator + number2 + " = " + (number - number2));
        } else if (operator.equals("*")) {
            System.out.println("tulos: " +number + operator + number2 + " = " + (number * number2));
        } else {
            System.out.println("tulos: " +number + operator + number2 + " = " + (number + number2));
        }

    input.close();
    
    }
}
