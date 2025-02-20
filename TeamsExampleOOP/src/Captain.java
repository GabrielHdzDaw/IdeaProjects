public class Captain extends Player{
    int yearsOfExperience;
    public Captain(String name, int age, int backNumber, int yearsOfExperience){
        super(name, age, backNumber );
        this.yearsOfExperience = yearsOfExperience;
    }

    public int getYearsOfExperience(){
        return yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience){
        this.yearsOfExperience = yearsOfExperience;
    }

    @Override
    public String toString(){
        return "Captain " + super.toString();
    }
}
