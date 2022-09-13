package currencyconvertor;

public class App {
    public static void main(String[] args) {

        try {
            // 1.
            CurrencyCalculator calc = new CurrencyCalculator();
            calc.convertor();

        } catch (Exception e) {

            e.fillInStackTrace();
            System.out.println("Error " + e.getMessage());

        }
    }
}
