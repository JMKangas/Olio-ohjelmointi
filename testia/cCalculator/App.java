/*
 *  1. Create an instance of the CurrencyCalculator class 
 *      1.1 Call the askUser() method
 *      1.2 Print the result of the conversion
 *  2. Create an instance of the SimpleCurrencyCalculator class 
 *     2.1 Call the convert() method
 *     2.2 Print the result of the conversion  
 */

public class App {
    public static void main(String[] args) {

        try {
            // 1.
            CurrencyCalculator calc = new CurrencyCalculator();
            calc.askUser();

            System.out.println("--------------------");

            // 2.
            //SimpleCurrencyCalculator simpleCalc = new SimpleCurrencyCalculator(100);
            //simpleCalc.convert();

        } catch (Exception e) {
            System.out.println("Error " + e.getMessage());
        }
    }
}
