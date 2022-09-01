package lenghtCount;

public class appi {
    
        public static void main(String[] args) {
        
            try {
            // ask a new password and calculate lenght of it
            System.out.println("Please give a password: ");
            String password = System.console().readLine();

            String result = passwordLenght(password);

            if (result.equals("1")) {
                System.out.println("Your password is accepted.");
            } else {
                System.out.println("Your password was not long enough. Minimum is 12. Please try again: ");
            }
            //int passwordLenght = password.length();
            //System.out.println("Your password is " + passwordLenght + " characters long.");

    
        }
        catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("\n");
        }
    }       
        static String passwordLenght (String password) {
            int passwordLenght = password.length();
            String shortPassword = "0";
            String longPassword = "1";
            if (passwordLenght < 12) {

                return shortPassword;

            } return longPassword;
        }
}
