package calculatorInheritance;

import java.util.Scanner;

public class calculator {

    String name = "";
    Double num1 = 0.0;
    Double num2 = 0.0;
    Double num3 = 0.0;
    Double num4 = 0.0;

    int choice = 0;
    int subchoice = 0;
    int basicChoice = 0;
    int specialChoice = 0;

    Double result = 0.0;
    Double sum = 0.0;

    public static void main(String[] args) {

        try {

            Scanner input = new Scanner(System.in);
            
            calculator calc = new calculator();
            calc.start();

            System.out.println("Would you like to use the basic calculator or the special calculator?");
            System.out.println("1. basic calculator");
            System.out.println("2. special calculator");

            int choice = input.nextInt();

            if (choice == 1) {
                
                System.out.println("\n" + "You have chosen the basic calculator.");

                while (true) {

                    basicCalculator basic = new basicCalculator();

                    // - four methods: plus, minus, division, multiply
                    System.out.println("Which operation would you like to use?");
                    System.out.println("1. Number A plus number B?");
                    System.out.println("2. Number A minus B?");
                    System.out.println("3. Number C divided by number D?");
                    System.out.println("4. Number C multiplied by number D?");

                    int basicChoice = input.nextInt();

                    if (basicChoice == 1) {

                        basic.plus(calc.num1, calc.num2);

                    } else if (basicChoice == 2) {

                        basic.minus(calc.num1, calc.num2);

                    } else if (basicChoice == 3) {

                        basic.division(calc.num3, calc.num4);

                    } else if (basicChoice == 4) {

                        basic.multiply(calc.num3, calc.num4);

                    } else {

                        System.out.println("Invalid choice");

                    }

                    System.out.println("Would you like to use the basic calculator again?");
                    System.out.println("1. yes");
                    System.out.println("2. no");

                    int subchoice = input.nextInt();

                    if (subchoice == 1) {
                        continue;
                    } else if (subchoice == 2) {
                        System.out.println("Thank you for using the basic calculator and object " + calc.getName() + "!");
                        break;
                    } else {
                        System.out.println("Invalid choice");
                    }
                }
  

            } else if (choice == 2) {
                
                while (true) {

                    specialCalculator special = new specialCalculator();

                    // - four methods: plus, minus, division, multiply
                    System.out.println("Which special operation would you like to use?");
                    System.out.println("1. Number A square minus number B square?");
                    System.out.println("2. Number A square root?");
                    System.out.println("3. Pi?");

                    int specialChoice = input.nextInt();

                    if (specialChoice == 1) {

                        special.square(calc.num1, calc.num2);

                    } else if (specialChoice == 2) {

                        special.squareRoot(calc.num1);

                    } else if (specialChoice == 3) {

                        special.pi();

                    } else {

                        System.out.println("Invalid choice");

                    }

                    System.out.println("Would you like to use the special calculator again?");
                    System.out.println("1. yes");
                    System.out.println("2. no");

                    int subchoice = input.nextInt();

                    if (subchoice == 1) {

                        continue;
                        
                    } else if (subchoice == 2) {

                        System.out.println("Thank you for using the special calculator and object " + calc.getName() + "!");
                        break;

                    } else {

                        System.out.println("Invalid choice");

                    }
                }

            input.close();
            }
        } catch (Exception e) {

            System.out.println("Error: " + e);

        } finally {

            System.out.println("Program terminated.");

        }

    }

    public void start() {
        //start calculator
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the calculator!");
        System.out.println("Create a new object to perform calculations?");
        System.out.println("1. Create a new object");
        System.out.println("2. Exit");

        System.out.print("Enter your choice: ");

        choice = input.nextInt();

        if (choice ==1) {

            System.out.println("Give an object a name and two numbers to perform calculations on.");
            System.out.println("Enter a name for the object: ");
            name = input.next();
            System.out.println("Enter a number (A) for the object: ");
            num1 = input.nextDouble();
            System.out.println("Enter a second number (B) for the object: ");
            num2 = input.nextDouble();
            System.out.println("Enter a third number (C) for the object: ");
            num3 = input.nextDouble();
            System.out.println("Enter a fourth number (D) for the object: ");
            num4 = input.nextDouble();

        } else if (choice == 2) {

            System.out.println("Exiting program...");
            System.exit(0);

        } else {

            System.out.println("Invalid choice. Exiting program...");
            System.exit(0);

        }

    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
