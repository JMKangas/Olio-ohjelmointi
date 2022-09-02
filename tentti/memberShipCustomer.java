package tentti;

public class memberShipCustomer extends mainCashier{ 
    
    public String firstname;
    private String lastname;
    private String phoneNumber;
    private String email;
    private int type; // 1 = member, 2 = business, 3 = regular
    
    public void memberCustomer(String firstname, String lastname, String phoneNumber, String email , int type) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.type = type;
    }
    
    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getType() {
        return type;
    }

}
