package NewMembership;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class register {
    
    
        public static void main(String[] args) {
            try {

                File file = new File("jasenrekisteri.txt");
                //FileWriter myWriter = new FileWriter(file, true);
                Scanner choiceInput = new Scanner(System.in);

                int choice;
                int subchoice;

                if (file.createNewFile()) {
                    System.out.println("File created: " + file.getName());
                } else {
                    System.out.println("File already exists.");
                }
    
                while (true) {
                    System.out.println("1) Add a new member to the register");
                    System.out.println("2) Print the entire content of the member register");
                    System.out.println("3) End the program");
                    System.out.println("Enter your choice:");
                    choiceInput = new Scanner(System.in);
                    choice = choiceInput.nextInt();
                    //choiceInput.nextLine();

                    if (choice == 1) {
    
                        addmember(file);
                        choice = 0;

                        System.out.println("1) Add another member" + "\n" + "2) return to main menu" + "\n" + "2) quit the program");
                        choiceInput = new Scanner(System.in);
                        subchoice = choiceInput.nextInt();                      


                        if (subchoice == 1) {
                            
                            addmember(file);
                            subchoice = 0;


                        } else if (subchoice == 2) {
    
                            continue;
                        } else {
    
                            break;
    
                        }
                        choiceInput.close();
                    } else if (choice == 2) {
                        
                        printmembers(file);
    
                        System.out.println("1) Return to the main menu");
                        System.out.println("2) End the program");
                        System.out.println("Enter your choice:");
    
                        choice = choiceInput.nextInt();
    
                        if (choice == 1) {
    
                            continue;
    
                        } else {
    
                            file.delete();
                            choiceInput.close();
                            break;
                            
                        }
    
                    } else {
    
                        file.delete();
                        choiceInput.close();
                        break;
    
                    }
                }
                choiceInput.close();
                } catch (IOException e) {
    
                    e.printStackTrace();
    
            } catch (Exception e) {
    
                e.printStackTrace();
    
            } finally {
    
                System.out.println("Thank you for using the program!");
    
            }

    }
    

private static void printmembers(File file)     {
        try {

            Scanner myReader = new Scanner(file);
            while (myReader.hasNextLine()) {
            System.out.println(myReader.nextLine());

            }
            System.out.println("\n");
            myReader.close();

        } catch (IOException e) {

            e.printStackTrace();

        }

    }

        private static void addmember(File file) {

            try {

            FileWriter myWriter = new FileWriter(file, true);
            Scanner input = new Scanner(System.in);
            String fname;
            String lname;
            String tel;

            System.out.println("First name:");
            fname = input.nextLine();
            System.out.println("Last name:");
            lname = input.nextLine();
            System.out.println("Telephone:");
            tel = input.nextLine();
    
            myWriter.write(fname + " " + lname + " " + tel + "\n");

            myWriter.close();
            System.out.println(fname + " " + lname + " " + tel + "\n");

 
    } catch (IOException e) {

        e.printStackTrace();

        }
    
    }

}
