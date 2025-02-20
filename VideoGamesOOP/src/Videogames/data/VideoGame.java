package Videogames.data;/* Create a program called VideoGameList.java to store objects of a class called Videogames.data.VideoGame that you must define.
For each videogame, we are going to store its title, genre and price. Add also the corresponding getters, setters
and constructor to set these values. Define a main, public class called VideoGameList in the same source file.
Then, in the main method of this class, create an array of 5 video games, ask the user to fill de information of
        each videogame, and then show the title of the cheapest and the most expensive video game of the array.*/


public class VideoGame {
    String title;
    String genre;
    double price;
    Company company;
    public VideoGame(){}
    public VideoGame(String title, String genre, double price, Company company) {
        this.title = title;
        this.genre = genre;
        this.price = price;
        this.company = company;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setCompany(Company company){
        this.company = company;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public double getPrice() {
        return price;
    }

    public Company getCompany(){
        return company;
    }

    public static void showCheapExpensivePrices(VideoGame[] videogames) {
        int min = 0;
        int max = 0;
        for (int i = 0; i < videogames.length; i++) {
            min = videogames[i].getPrice() < videogames[min].getPrice() ? i : min;
            max = videogames[i].getPrice() > videogames[max].getPrice() ? i : max;
        }
        System.out.println("Cheapest game: " + videogames[min].getPrice() + "\nMost expensive game: " + videogames[max].getPrice());
    }

    @Override
    public String toString() {
        return "Title: " + title + " | Genre: " + genre + " | Price " + price + " | " + getCompany();
    }
}