package password2;
import java.util.Scanner;

public class passwordReader2 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Please give your first name: ");
        String firstName = input.next();
        System.out.println("Please give your last name: ");
        String lastName = input.next();
        System.out.println("Please give your age: ");
        String age = input.next();

        int nameLenght = firstName.length() + lastName.length();
        String lastLetters = firstName.substring(Math.max(firstName.length() - 2, 0));

        char charToAdd = firstName.charAt(1);
        char charToAdd2 = lastName.charAt(0);
        charToAdd2 = Character.toLowerCase(charToAdd2);
        int randomNumber = (int)(Math.random() * 10);
        int randomNumber2 = (int)(Math.random() * 10);

        String Lenght = Integer.toString(nameLenght);
        
        String password = charToAdd + age + charToAdd2 + Lenght + lastLetters.toUpperCase() + randomNumber + randomNumber2;

        System.out.println("Salasanasi on: " + password);

    input.close();
    }
}
