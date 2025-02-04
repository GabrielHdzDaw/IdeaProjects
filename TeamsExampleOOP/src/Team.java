public class Team {
    private String name;
    private int years;
    private Player[] players;

    public Team(String name, int years, Player[] players){
        this.name = name;
        this.years = years;
        this.players = players;
    }

    public String getName(){
        return name;
    }

    public int getYears(){
        return years;
    }

    public Player[] getPlayers(){
        return players;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setYears(int years){
        this.years = years;
    }

    public void setPlayers(Player[] players){
        this.players = players;
    }

    @Override
    public String toString(){
        String playersString = "";
        for (Player player: getPlayers()) {
            playersString += player + "\n";
        }
        return "Team name: " + name + " | Team years: " + years + " | Team players: \n" + playersString;
    }
}
