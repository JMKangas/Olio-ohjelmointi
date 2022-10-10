

public class Player {
    
    private String firstName;
    private String lastName;
    private String userName;
    private String pswd;

    public Player(String firstName, String lastName, String userName, String pswd) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.pswd = pswd;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    
    public void setPswd(String pswd) { //For security reasons, the password can't be retrieved.
        this.pswd = pswd;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public void greeting() {

        System.out.println("Have a fun time!" + "\n");

    }
}
