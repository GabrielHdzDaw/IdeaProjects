package Ships.data;

public class Ship {
    String name;
    String material;
    int nAnchors;
    int length;

    public Ship(String name, String material, int nAnchors, int length){
        this.name = name;
        this.material = material;
        this.nAnchors = nAnchors;
        this.length = length;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getnAnchors() {
        return nAnchors;
    }

    public void setnAnchors(int nAnchors) {
        this.nAnchors = nAnchors;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Ships.data.Ship{" +
                "name='" + name + '\'' +
                ", material='" + material + '\'' +
                ", nAnchors=" + nAnchors +
                ", length=" + length +
                '}';
    }
}
