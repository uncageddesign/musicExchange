package instruments;

public class Brass extends Instrument{

    private int bore;
    private String key;

    public Brass(String make, String model, Double boughtPrice, Double sellingPrice, String family, String material, String colour, Boolean displayInstrument, int bore, String key) {
        super(make, model, boughtPrice, sellingPrice, family, material, colour, displayInstrument);
        this.bore = bore;
        this.key = key;
    }

    public int getBore() {
        return bore;
    }

    public String getKey() {
        return key;
    }
}
