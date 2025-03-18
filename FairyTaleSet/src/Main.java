//Author: gabhercol
//Date: 18/3/2025
//Description: Create a project called FairyTaleSet with a main program that stores a set of fairy tales. For each
// fairy tale, we are going to store its title and the number of pages, so define a FairyTale class with these two
// attributes, a constructor and the corresponding getters and setters.
//    Also, override equals method to determine when two fairy tales will be considered the same: they will be the
//    same whenever they have the same title. Then, in the main application, define a set of FairyTale objects, and
//    add some of them to the list. Try to add some fairy tales with the same title, to see how many of them are
//    finally included in the set. Then, explore the set with an iterator and print the data in the screen (you can
//    also override toString method for this).
//
//    NOTE: in order to determine if two fairy tales are the same by title, besides overriding equals method, you need
//    to override hashCode method to generate a hash code with its title (not the number of pages), so that Java can
//    compare two hash codes of two different fairy tales and determine that the titles are the same. hashcode method
//    can be automatically generated by IntelliJ, as getters, setters and other common methods.

import java.util.*;

public class Main {
    public static void main(String[] args) {
        FairyTale[] tales = {
                new FairyTale("Cinderella", 120),
                new FairyTale("Snow White", 150),
                new FairyTale("Hansel and Gretel", 80),
                new FairyTale("Little Red Riding Hood", 60),
                new FairyTale("The Ugly Duckling", 40),
                new FairyTale("Beauty and the Beast", 200),
                new FairyTale("The Little Mermaid", 180),
                new FairyTale("Jack and the Beanstalk", 90),
                new FairyTale("Sleeping Beauty", 160),
                new FairyTale("Rapunzel", 130)
        };

        Set<FairyTale> talesSet = new HashSet<>();

        talesSet.addAll(Arrays.asList(tales));

        talesSet.add(new FairyTale("The Ugly Duckling", 40));
        for (FairyTale tale: talesSet){
            System.out.println(tale);
        }

    }
}