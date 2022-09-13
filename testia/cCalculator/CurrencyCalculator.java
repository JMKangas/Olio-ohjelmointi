

import java.util.Scanner;

public class CurrencyCalculator {

  private Scanner input;
  private double euros;
  private double newCurrency;

  public CurrencyCalculator() {

    input = new Scanner(System.in);

  }

  public void askUser() {

    System.out.println("Hello to currency Calculator!");
    System.out.println("With this app you can convert your euros to different currencies.");
    
    currencyObject simpleCalc = new currencyObject(euros);

    System.out.println("Exchange rates are as follows:");
    System.out.println("1 EUR = 1.003 USD");
    System.out.println("1 EUR = 0.86 GBP");
    System.out.println("1 EUR = 0.98 CHF");
    System.out.println("1 EUR = 139.71 JPY");
    System.out.println("1 EUR = 120.74 KES");

    while (true) {
      
      System.out.println("\n" + "Give me amount of euros to convert: ");
      euros = input.nextDouble();
      System.out.println("What currency do you want to convert to?");
      System.out.println("1. usd");
      System.out.println("2. GBP");
      System.out.println("3. CHF");
      System.out.println("4. JPY");
      System.out.println("5. KES");

      simpleCalc.setEuros(euros);
      simpleCalc.setUsd(euros);
      simpleCalc.setGbp(euros);
      simpleCalc.setChf(euros);
      simpleCalc.setJpy(euros);
      simpleCalc.setKes(euros);

      int choice = input.nextInt();
      if (choice == 1) {

        newCurrency = simpleCalc.getUsd();

        newCurrency = Math.round(newCurrency * 100);
        newCurrency = newCurrency/100;

        System.out.println("You have " + newCurrency + " USD");

      } else if (choice == 2) {
        newCurrency = simpleCalc.getGbp();

        newCurrency = Math.round(newCurrency * 100);
        newCurrency = newCurrency/100;

        System.out.println("You have " + newCurrency + " GBP");
      } else if (choice == 3) {

        newCurrency = simpleCalc.getChf();
  
        newCurrency = Math.round(newCurrency * 100);
        newCurrency = newCurrency/100;

        System.out.println("You have " + newCurrency + " CHF");
      } else if (choice == 4) {

        newCurrency = simpleCalc.getJpy();

        newCurrency = Math.round(newCurrency * 100);
        newCurrency = newCurrency/100;

        System.out.println("You have " + newCurrency + " JPY");
      } else if (choice == 5) {

        newCurrency = simpleCalc.getKes();

        newCurrency = Math.round(newCurrency * 100);
        newCurrency = newCurrency/100;

        System.out.println("You have " + newCurrency + " KES");
      } else {

        System.out.println("invalid choice");

        input.close();
        break;

      }
    }
  }
}
