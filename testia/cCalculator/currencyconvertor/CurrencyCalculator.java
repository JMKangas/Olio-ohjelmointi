package currencyconvertor;

import java.util.Scanner;

public class CurrencyCalculator {

  private Scanner input;
  private double euros;
  private double newCurrency;

  public CurrencyCalculator() {

    input = new Scanner(System.in);

  }

  public void convertor() {

    System.out.println("Hello to currency Calculator!");
    System.out.println("With this app you can convert your euros to different currencies.");

    currencyObject currencyCalc = new currencyObject(euros);

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

      currencyCalc.setEuros(euros);
      currencyCalc.setUsd(euros);
      currencyCalc.setGbp(euros);
      currencyCalc.setChf(euros);
      currencyCalc.setJpy(euros);
      currencyCalc.setKes(euros);

      int choice = input.nextInt();
        if (choice == 1) {

            newCurrency = currencyCalc.getUsd();

            newCurrency = Math.round(newCurrency * 100);
            newCurrency = newCurrency/100;

            System.out.println("You have " + newCurrency + " USD");

        } else if (choice == 2) {
            newCurrency = currencyCalc.getGbp();

            newCurrency = Math.round(newCurrency * 100);
            newCurrency = newCurrency/100;

            System.out.println("You have " + newCurrency + " GBP");
        } else if (choice == 3) {

            newCurrency = currencyCalc.getChf();
      
            newCurrency = Math.round(newCurrency * 100);
            newCurrency = newCurrency/100;

            System.out.println("You have " + newCurrency + " CHF");
        } else if (choice == 4) {

            newCurrency = currencyCalc.getJpy();

            newCurrency = Math.round(newCurrency * 100);
            newCurrency = newCurrency/100;

            System.out.println("You have " + newCurrency + " JPY");
        } else if (choice == 5) {

            newCurrency = currencyCalc.getKes();

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
