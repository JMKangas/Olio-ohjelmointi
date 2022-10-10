

public class WarriorPlayer extends Player {
    
    String team = "caveClan";


    public WarriorPlayer(String firstName, String lastName, String userName, String pswd) {
        super(firstName, lastName, userName, pswd);
    }

    public String getTeam() {
        return team;
    }

    public String caveManGreeting() {

        //System.out.println("Welcome to the " + this.team + "! " + firstName + " " + lastName + "!");
        return "Welcome to the " + this.team + ", ugh!";
    }
}
