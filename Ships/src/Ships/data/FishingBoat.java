package Ships.data;

public class FishingBoat extends Ship{
    String type;

    public FishingBoat(String name, String material, int nAnchors, int length, String type) {
        super(name, material, nAnchors, length);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return super.toString() +
                "type='" + type + '\'' +
                '}';
    }
}
