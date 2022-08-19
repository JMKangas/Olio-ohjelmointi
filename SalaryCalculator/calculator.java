import java.util.Scanner;

public class calculator {
   
   public static void main(String[] args) {
        
      Scanner input = new Scanner(System.in);
      System.out.println("Please enter your name: ");
      String name = input.next();
      System.out.println("Please enter your salary: ");
      int salary = input.nextInt();
      System.out.println("Please enter your tax %: ");
      double tax = input.nextDouble();

      double salaryAfterTax = salary - (salary * tax / 100);

      System.out.println("Hello " + name + ", your salary is " + salary + " euros.");
      System.out.println("And after taxes your gross salary is: " + salaryAfterTax + " euros.");

  input.close();
  
  }
}
