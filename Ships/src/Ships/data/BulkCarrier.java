package Ships.data;

public class BulkCarrier extends Ship{
    int loadHatches;

    public BulkCarrier(String name, String material, int nAnchors, int length, int loadHatches) {
        super(name, material, nAnchors, length);
        this.loadHatches = loadHatches;
    }

    public int getLoadHatches() {
        return loadHatches;
    }

    public void setLoadHatches(int loadHatches) {
        this.loadHatches = loadHatches;
    }

    @Override
    public String toString() {
        return super.toString() +
                "loadHatches=" + loadHatches +
                '}';
    }
}
