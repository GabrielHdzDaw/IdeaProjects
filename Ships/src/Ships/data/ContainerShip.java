package Ships.data;

public class ContainerShip extends Ship {
    int TEU;
    public ContainerShip(String name, String material, int nAnchors, int length, int TEU) {
        super(name, material, nAnchors, length);
        this.TEU = TEU;
    }

    public int getTEU() {
        return TEU;
    }

    public void setTEU(int TEU) {
        this.TEU = TEU;
    }

    @Override
    public String toString() {
        return super.toString() +
                "TEU=" + TEU +
                '}';
    }
}
