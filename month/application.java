package month;
import java.util.Scanner;

public class application {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please pick a number of a month: ");
        int userPick = input.nextInt();
        
        switch (userPick) {

            case 1:
                System.out.println("January");
                System.out.println("31 days");
                break;
            
            case 2:
                System.out.println("February");
                System.out.println("28 days");
                break;
            
            case 3:
                System.out.println("March");
                System.out.println("31 days");
                break;
            
            case 4:
                System.out.println("April");
                System.out.println("30 days");

            case 5:
                System.out.println("May");
                System.out.println("31 days");
                break;
            
            case 6:
                System.out.println("June");
                System.out.println("28 days");
                break;
            
            case 7:
                System.out.println("July");
                System.out.println("31 days");
                break;
            
            case 8:
                System.out.println("August");
                System.out.println("31 days");
                break;
            
            case 9:
                System.out.println("September");
                System.out.println("30 days");
                break;
            
            case 10:
                System.out.println("October");
                System.out.println("31 days");
                break;
            
            case 11:
                System.out.println("Novermber");
                System.out.println("30 days");
                break;
            
            case 12:
                System.out.println("December");
                System.out.println("31 days");
                break;
        }

    input.close();
    }
}
