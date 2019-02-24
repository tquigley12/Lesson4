package lesson4;
/**
 *
 * The purpose of this enum is to store information on NBA Central division
 * @author tquigley1
 */
public enum Team {
    BUCKS ("Milwaukee", "Bucks"),
    BULLS ("Chicago", "Bulls"),
    CAVALIERS ("Cleveland", "Cavaliers"),
    PACERS ("Indiana", "Pacers"),
    PISTONS ("Detroit", "Pistons");
    
    private final String city;
    private final String team;

    Team (String city, String team) {
        this.city = city;
        this.team = team;
    }
    
    public String getCity() {
        return this.city;
    }
    
    public String getTeam() {
        return this.team;
    }
    
    @Override
    public String toString() {
        String str = ("The team name is " + getCity() + " " + getTeam());
        return str;
    }
    
}