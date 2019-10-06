package instruments;

public class Woodwind extends Instrument {

    private String reed;
    private String type;

    public Woodwind(String make, String model, Double boughtPrice, Double sellingPrice, String family, String material, String colour, Boolean displayInstrument, String reed, String type) {
        super(make, model, boughtPrice, sellingPrice, family, material, colour, displayInstrument);
        this.reed = reed;
        this.type = type;
    }

    public String getReed() {
        return reed;
    }

    public String getType() {
        return type;
    }

}
