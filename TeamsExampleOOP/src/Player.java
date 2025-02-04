public class Player {
    private String name;
    private int age;
    private int backNumber;

    public Player(String name, int age, int backNumber){
        this.name = name;
        this.age = age;
        this.backNumber = backNumber;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public int getBackNumber(){
        return backNumber;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setBackNumber(int backNumber){
        this.backNumber = backNumber;
    }

    @Override
    public String toString(){
        return "  Name: " + name + " | Age: " + age + " | Back number: " + backNumber;
    }
}
