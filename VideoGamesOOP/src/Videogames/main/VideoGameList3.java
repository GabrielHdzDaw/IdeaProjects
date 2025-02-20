package Videogames.main;

import Videogames.data.Company;
import Videogames.data.PCVideoGame;
import Videogames.data.VideoGame;

import java.util.Scanner;

public class VideoGameList3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Company[] companies = {
                new Company("Capcom", 1987),
                new Company("UbiSoft", 1998),
                new Company("Lucas Arts", 1982),
                new Company("Neowiz", 1997)
        };

        VideoGame[] games = {
                new VideoGame("Street Fighter III: 3rd Strike", "Fighting", 29.39, companies[0]),
                new PCVideoGame("Jedi Knight II Jedi Outcast", "FPS", 29.23, companies[2], 512, 512)
        };

        for (VideoGame game : games) {
            System.out.println(game);
            System.out.println("-----");
        }

        VideoGame.showCheapExpensivePrices(games);
    }
}
