//Author: gabhercol
//Date: 18/3/2025
//Description:

//Exercise 1:
//
//Create a project called Library, with a main class called Library and another
//class called Book, in which we are going to store some information about each
//        book: the id (a string), the title and the author’s name. In the main
//application, define a map of books, whose keys will be their corresponding
//ids. Manually add some books to the map, and then explore it and show the
//books in the screen (override the toString method of Book class to properly show book info).


import java.util.HashMap;

public class Library {
    public static void main(String[] args) {
        HashMap<String, Book> bookMap = new HashMap<>();
        Book[] books = {
                new Book("LA", "Las aventuras", "José"),
                new Book("LP", "Las patatas", "José"),
                new Book("DE", "¿Dónde está?", "Mauricio"),
                new Book("M", "Mañana", "Mamma"),
                new Book("J", "Josefa", "Josefa"),
                new Book("F", "Filigrani", "Ronaldinho"),
                new Book("LS", "Los salones", "Fausto")
        };

        for (Book b : books){
            bookMap.put(b.getId(), b);
        }

        for (String key : bookMap.keySet()){
            System.out.println(bookMap.get(key));
        }
    }
}
