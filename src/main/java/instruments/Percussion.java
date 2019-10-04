package instruments;

public class Percussion extends Instrument {

    private String type;

    public Percussion(String make, String model, Double boughtPrice, Double sellingPrice, String family, String material, String colour, Boolean displayInstrument, String type) {
        super(make, model, boughtPrice, sellingPrice, family, material, colour, displayInstrument);
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
