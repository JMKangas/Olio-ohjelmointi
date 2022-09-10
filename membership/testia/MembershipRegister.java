
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
import java.io.File;

public class MembershipRegister {

    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(System.in);
            String fname;
            String lname;
            String tel;
            int choice;

            File file = new File("jasenrekisteri.txt");
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }

            while (true) {
                System.out.println("1) Add a new member to the register");
                System.out.println("2) Print the entire content of the member register");
                System.out.println("Enter your choice:");
                choice = input.nextInt();
                input.nextLine();

                if (choice == 1) {

                    System.out.println("First name:");
                    fname = input.nextLine();
                    System.out.println("Last name:");
                    lname = input.nextLine();
                    System.out.println("Telephone:");
                    tel = input.nextLine();

                    FileWriter myWriter = new FileWriter(file, true);
                    myWriter.write(fname + " " + lname + " " + tel + "\n");
                    myWriter.close();

                    System.out.println("1) Add another member" + "\n" + "2) return to main menu" + "\n" + "2) quit the program");
                   
                    int subchoice = input.nextInt();

                    if (subchoice == 1) {

                        System.out.println("First name:");
                        fname = input.next();
                        System.out.println("Last name:");
                        lname = input.next();
                        System.out.println("Telephone:");
                        tel = input.next();

                        myWriter = new FileWriter(file, true);
                        myWriter.write(fname + " " + lname + " " + tel + "\n");
                        myWriter.close();

                    } else if (subchoice == 2) {

                        continue;

                    } else {

                        break;

                    }

                } else if (choice == 2) {
                    
                    Scanner myReader = new Scanner(file);
                    while (myReader.hasNextLine()) {
                    System.out.println(myReader.nextLine());

                    }

                    myReader.close();

                    System.out.println("1) Return to the main menu");
                    System.out.println("2) End the program");
                    System.out.println("Enter your choice:");

                    choice = input.nextInt();

                    if (choice == 1) {

                        continue;

                    } else {

                        file.delete();
                        input.close();
                        break;
                        
                    }

                } else {

                    file.delete();
                    input.close();
                    break;

                }
            }

            } catch (IOException e) {

                e.printStackTrace();

        } catch (Exception e) {

            e.printStackTrace();

        } finally {

            System.out.println("Thank you for using the program!");

        }
    }
}
