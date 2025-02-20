package Videogames.data;

public class PCVideoGame extends VideoGame{
    int minimumRAM;
    int minimumHD;
    public PCVideoGame(){}
    public PCVideoGame(String title, String genre, double price, Company company, int minimumRAM, int minimumHD){
        super(title, genre, price, company);
        this.minimumRAM = minimumRAM;
        this.minimumHD = minimumHD;
    }

    public int getMinimumRAM(){
        return minimumRAM;
    }

    public int getMinimumHD(){
        return minimumHD;
    }

    public void setMinimumRAM(int minimumRAM){
        this.minimumRAM = minimumRAM;
    }

    public void setMinimumHD(int minimumHD){
        this.minimumHD = minimumHD;
    }

    @Override
    public String toString(){
        return super.toString() + String.format(" Minimum RAM: %d Minimum HD: %d", minimumRAM, minimumHD);
    }
}
