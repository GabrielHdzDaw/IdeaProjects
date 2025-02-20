package Videogames.main;//Improve exercise VideoGameList.java from previous document in another source
//file called VideoGameList2.java. Now, every video game has a Videogames.data.Company that created
//it. For every company, we need to store its name and the foundation year. Associate
//a company to each video game, so that some video games can share the same company object.
//Then, modify the main application to specify the company information for every videogame
//        (besides video game initial data). Make sure that you share the same Videogames.data.Company object
//among all the video games belonging to the same company.


import Videogames.data.Company;
import Videogames.data.VideoGame;

import java.util.Scanner;

public class VideoGameExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        VideoGame[] videogames = new VideoGame[5];
        Company[] companies = {
                new Company("Capcom", 1987),
                new Company("UbiSoft", 1998),
                new Company("Neowiz", 1997)
        };

        for (int i = 0; i < videogames.length; i++) {

            System.out.printf("Enter %dº video game title: ", i + 1);
            String title = sc.nextLine();

            System.out.printf("Enter %dº video game genre: ", i + 1);
            String genre = sc.nextLine();

            System.out.printf("Enter %dº video game price: ", i + 1);
            double price = sc.nextDouble();
            System.out.printf("Enter %dº video game company. Choose one:\n", i + 1);
            for (int j = 0; j < companies.length; j++) {
                System.out.printf("\n%dº. %s", j + 1, companies[j]);
            }
            int chosenCompany = sc.nextInt();
            sc.nextLine();
            Company company = companies[chosenCompany - 1];
            videogames[i] = new VideoGame(title, genre, price, company);
        }

        for (VideoGame game : videogames) {
            System.out.println(game);
            System.out.println("-----");
        }

        VideoGame.showCheapExpensivePrices(videogames);
    }
}
