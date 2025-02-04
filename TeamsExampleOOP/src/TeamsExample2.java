//Improve exercise TeamsExample.java from previous document in another source file called TeamsExample2.java.
//Now every team will have an array of 5 players. Add a new class called Player to the source file. For
//        each player, we need to define his/her name, age and back number. Add the corresponding
//constructor and getters/setters. Then, modify Team class to store 5 Player objects, and adapt your
//main function to create a team with all the players inside it. Print the information of the team,
//including the players that belong to it.


public class TeamsExample2 {
    public static void main(String[] args) {

        Player[] players = {
                new Player("Jose", 23, 9),
                new Player("Pepe", 21, 13),
                new Player("María", 25, 1),
                new Player("Esteban", 19, 3),
                new Player("Anacleta", 42, 6),
        };

        Team team1 = new Team("Patatas alioli ñam ñam", 25, players);

        System.out.println(team1);
    }
}