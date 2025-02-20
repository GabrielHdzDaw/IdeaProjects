package Ships.data;

public class Tanker extends Ship{
    boolean doubleHelmet;
    int capacity;

    public Tanker(String name, String material, int nAnchors, int length, boolean doubleHelmet, int capacity) {
        super(name, material, nAnchors, length);
        this.doubleHelmet = doubleHelmet;
        this.capacity = capacity;
    }

    public boolean isDoubleHelmet() {
        return doubleHelmet;
    }

    public void setDoubleHelmet(boolean doubleHelmet) {
        this.doubleHelmet = doubleHelmet;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return super.toString() +
                "doubleHelmet=" + doubleHelmet +
                ", capacity=" + capacity +
                '}';
    }
}
