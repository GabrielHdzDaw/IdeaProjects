package Videogames.data;

public class Company {
    String name;
    int foundationYear;

    public Company(String name, int foundationYear){
        this.name = name;
        this.foundationYear = foundationYear;
    }

    public String getName(){
        return name;
    }

    public int getFoundationYear(){
        return foundationYear;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setFoundationYear(int foundationYear){
        this.foundationYear = foundationYear;
    }


    @Override
    public String toString(){
        return "Videogames.data.Company name: " + name + " | Foundation year: " + foundationYear;
    }
}
