package tentti;

import java.util.*;

public class mainCashier {
    public static void main(String[] args) {
        
         try {   

            int choice = 0;
            double totalSum = 0.0;
            double shoppingChoice = 0.0;
            Scanner input = new Scanner(System.in);

                System.out.println("Welcome to the cashier application!");
                System.out.println("Please choose what you want to do: " + "\n" + "1. Start shopping " + "2. Exit");
                choice = input.nextInt();

                    if (choice == 1) {
                        System.out.println("You have chosen to start shopping!");
                        while (true) {
                            System.out.println("Please tell me the prices of the items you want to buy: ");
                            shoppingChoice = input.nextDouble();

                                totalSum = totalSum + shoppingChoice;

                            System.out.println("Do you want to continue shopping? " + "\n" + "1. Yes " + "2. No");
                            choice = input.nextInt();
                                if (choice == 2) {                            
                                    break;
                                } else {
                                    continue;
                                }                   
                            }                          
                            totalSum = Math.round(totalSum * 100);
                            totalSum = totalSum/100;
                            
                            System.out.println("Please write your firstname: ");
                            String customerFName = input.next();
                            System.out.println("Please write your lastname: ");
                            String customerLname = input.next();
                            System.out.println("Please write your phone number: ");
                            String customerPhone = input.next();
                            System.out.println("Please write your email: ");
                            String customerEmail = input.next();
                            System.out.println("Are you : " + "\n" + "1. Membercustomer or " + "\n" + "2. Business customer? " + "\n" + "3. Regular");  
                            int customerType = input.nextInt();

                            System.out.println("Would you like to be added as a customer? " + "\n" + "1.Yes " + " 2.No");

                            int addCustomer = input.nextInt();

                            if (addCustomer == 1) {

                                if (customerType == 1) {

                                    memberShipCustomer customer1 = new memberShipCustomer();
                                    customer1.memberCustomer(customerFName, customerLname, customerPhone, customerEmail, customerType);
                                    System.out.println(customer1.getFirstname() + " " + customer1.getLastname() + " " + customer1.getPhoneNumber() + " " + customer1.getEmail());
                                    System.out.println("You have chosen to be a member customer!");
                                    System.out.println("You have 5% discount!");
                                    System.out.println("\n" + "The total sum of your shopping is: " + (totalSum - (totalSum * 0.05)) + "\n");
                                    System.out.println("Thank you for shopping with us!");
                                    System.out.println("Have a nice day!");
                                    System.out.println("Goodbye!");

                                } else if (customerType == 2) {

                                    businessCustomer customer2 = new businessCustomer();
                                    customer2.business(customerFName, customerLname, customerPhone, customerEmail, customerType);
                                    System.out.println(customer2.getFirstname() + " " + customer2.getLastname() + " " + customer2.getPhoneNumber() + " " + customer2.getEmail());
                                    System.out.println("You have chosen to be a business customer!");
                                    System.out.println("You have 10% discount!");
                                    System.out.println("The total sum of your shopping is: " + (totalSum - (totalSum * 0.1)) + "\n");
                                    System.out.println("Thank you for shopping with us!");
                                    System.out.println("Have a nice day!");
                                    System.out.println("Goodbye!");
                                    
                                } else if (customerType == 3) {
                                    
                                    customer customer3 = new customer();
                                    customer3.normalCustomer(customerFName, customerLname, customerPhone, customerEmail, customerType);
                                    System.out.println(customer3.getFirstname() + " " + customer3.getLastname() + " " + customer3.getPhoneNumber() + " " + customer3.getEmail());
                                    System.out.println("You have chosen to be a regular customer!");
                                    System.out.println("\n" + "The total sum of your shopping is: " + totalSum + "\n");
                                    System.out.println("Thank you for shopping with us!");
                                    System.out.println("Have a nice day!");
                                    System.out.println("Goodbye!");
                                    
                                } else {
                                    System.out.println("You have entered an invalid choice!");
                                    System.exit(0);
                                }
                                
                            } else {
                                System.out.println("You have chosen to not add you as customer!");
                                System.out.println("Thank you for shopping with us!" + "\n");
                                if (customerType == 1) {

                                    System.out.println("You have 5% discount!");
                                    System.out.println("\n" + "The total sum of your shopping is: " + (totalSum - (totalSum * 0.05)));

                                } else if (customerType == 2) {

                                    System.out.println("You have 10% discount!");
                                    System.out.println("The total sum of your shopping is: " + (totalSum - (totalSum * 0.1)));

                                } else if (customerType == 3) {

                                    System.out.println("\n" + "The total sum of your shopping is: " + totalSum + "\n");

                                } else {

                                    System.out.println("You have entered an invalid choice!");
                                    System.exit(0);
                                }
                                System.out.println("Have a nice day!");
                                System.out.println("Goodbye!");
                            }
                
            
                        } else if (choice == 2) {
                            System.out.println("You have chosen to exit the application!");
                            System.exit(0);
                        } else {
                            System.out.println("You have entered an invalid choice!");
                            System.exit(0);
                        }
                input.close();

         } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
         } finally {
            System.out.println("Thank you for using the cashier application!");
         }

    }
}
 