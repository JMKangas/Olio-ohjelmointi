package OOPCalculatorRefined;

import java.util.*;


public class Calculator {

    /**
     * @param args
     */
    public static void main(String[] args) {
        
        int choice;
        int subchoice;
        double num1;

            try {
                Scanner input = new Scanner(System.in);  
                
                System.out.println("Welcome to the calculator!");
                System.out.println("Create a new object to perform calculations?");
                System.out.println("1. Create a new object");
                System.out.println("2. Exit");
                System.out.print("Enter your choice: ");
                choice = input.nextInt();
                
                if (choice == 1) {
                    System.out.println("\n" + "Give an object a name and two numbers to perform calculations on.");
                    System.out.println("Enter a name for the object: ");
                    String obName = input.next();
                    System.out.println("Enter a number for the object: ");
                    num1 = input.nextDouble();
                    System.out.println("Enter a second number for the object: ");
                    double num2 = input.nextDouble();
                    
                    CalculateClass calc = new CalculateClass();

                    userNumber1(calc, num1);
                    userNumber2(calc, num2);
                    
                    while(true) {
                    System.out.println("What would you like to do with the " + obName + "?");
                    System.out.println("1. Divide the two numbers.");
                    System.out.println("2. Double the first number.");
                    System.out.println("3. Double the second number.");
                    System.out.println("4. Add the two numbers.");
                    System.out.println("5. Multiply the two numbers.");
                    System.out.println("6. Exit");
                    System.out.print("Enter your choice: ");
                    subchoice = input.nextInt();
                    
                    if (subchoice == 1) {
                        calc.divide();
                    }
                    else if (subchoice == 2) {
                        calc.doubleNum();
                    }
                    else if (subchoice == 3) {
                        calc.doubleNum2();
                    }
                    else if (subchoice == 4) {
                        calc.doubleSum();
                    }
                    else if (subchoice == 5) {
                        calc.multiply();
                    }
                    else if (subchoice == 6) {
                        System.out.println("Thank you for using the calculator and object " + obName + "!");
                        System.exit(0);
                    }
                    else {
                        System.out.println("Invalid choice. Try again.");
                    }
                    }
                }
                else if (choice == 2) {
                
                    System.exit(0);
                    
        } input.close();
            } catch (Exception e) {
                
                System.out.println("Invalid input. Try again.");
                e.getStackTrace();

            } finally {

                System.out.println("Thank you for using the calculator!");
                
            }
        
        //Set x and y values
        //calc.setX(10);
        //calc.setY(5);


    }

    /**
     * 
     */
    public static void userNumber1(CalculateClass calculationObject, double number1) {

        calculationObject.setX(number1);

    }

    public static void userNumber2(CalculateClass calculationObject, double number2) {

        calculationObject.setY(number2);
        
    }
}
