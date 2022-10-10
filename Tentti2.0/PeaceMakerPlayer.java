

public class PeaceMakerPlayer extends Player {
    

    private String team = "earthProtectors";
    private Boolean smile = true;


    public PeaceMakerPlayer(String firstName, String lastName, String userName, String pswd) {
        super(firstName, lastName, userName, pswd);
    }

    public String getTeam() {
        return team;
    }

    public String areYouSmiling() {

        String smiling;

        if (smile == true) {

            smiling = "You are smiling!";

        } else {
            
            smiling = "You are not smiling!";

        }

        return smiling;
    }

    public String peaceGreeting() {

        return "May the force be with you!";

    }

    public String goodHealtGreeting() {

       return "Welcome to the " + this.getTeam() + " " + this.getUserName() + "! May you have a good health!";

    }
}
