package testia;


import java.text.*;  
import java.util.Date;  
 
import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.util.Scanner;


public class appi {
    
    public static void main(String[] args) {


        
        try {

                BufferedReader br = null;
                Scanner input = new Scanner(System.in);
                br = new BufferedReader(new InputStreamReader(System.in));
                SimpleDateFormat sdf = new SimpleDateFormat("dd MM yyyy");

                System.out.println("Hello! Welcome to the date calculator!" + "\n" + "Please enter the date you want to calculate the difference between. Note that difference comes between your date and today." + "\n" + "Format: dd mm yyyy (example: 01 01 2018)");
                
                Date dt1 = sdf.parse(br.readLine().trim());

                System.out.println("Would you like to have difference in days or months? (days/months)" + "\n" + "1. Days" + "\n" + "2. Months");
                int choice = input.nextInt();

                if (choice == 1) {

                    Days(dt1);

                } else if (choice == 2) {

                    Months(dt1);

                } else {
                    System.out.println("Invalid choice!");
                }

                if (br != null) {
                    br.close();
                }
                input.close();
            }
            catch (Exception e) {
                System.out.println(e);
            } finally {
                System.out.println("Finally");
            }

        }
        static void Days (Date dt1) {

            try {

            SimpleDateFormat sdf = new SimpleDateFormat("dd MM yyyy");

            Date date = new Date();
            String now = sdf.format(date);

            Date dt2 = sdf.parse(now);
 

            long diff = dt2.getTime() - dt1.getTime();

            long days = (diff / 1000L / 60L / 60L / 24L);

            System.out.println("Days: " + days);

            }
            catch (Exception e) {
                System.out.println(e);
            } finally {
                System.out.println("\n");
            }
        }

        static void Months(Date dt1) {

            try {

            SimpleDateFormat sdf = new SimpleDateFormat("dd MM yyyy");

            SimpleDateFormat formatter = new SimpleDateFormat("dd MM yyyy");
            Date date = new Date();
            String now = formatter.format(date);

            Date dt2 = sdf.parse(now);
            long diff = dt2.getTime() - dt1.getTime();

            long days = (diff / 1000L / 60L / 60L / 24L);
            double months = days / 30.417;

            System.out.println("Days: " + diff / 1000L / 60L / 60L / 24L);
            System.out.format("Months: " + "%.2f", months);

            }
            catch (Exception e) {
                System.out.println(e);
            } finally {
                System.out.println("\n");
            }
        }
}
