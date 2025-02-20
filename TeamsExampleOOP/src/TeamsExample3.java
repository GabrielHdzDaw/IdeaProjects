public class TeamsExample3 {
    public static void main(String[] args) {
        Player[] players = {
                new Player("Jose", 23, 10),
                new Player("Pepe", 21, 13),
                new Player("María", 25, 1),
                new Player("Esteban", 19, 3),
                new Player("Anacleta", 42, 6),
                new Captain("Oliver", 17, 9, 16)
        };

        Team team1 = new Team("Patatas alioli ñam ñam", 25, players);

        System.out.println(team1);
    }
}
