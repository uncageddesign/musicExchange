package instruments;

public abstract class Stringed extends Instrument {

    private int stringNo;
    private String type;

    public Stringed(String make, String model, Double boughtPrice, Double sellingPrice, String family, String material, String colour, Boolean displayInstrument, int stringNo, String type) {
        super(make, model, boughtPrice, sellingPrice, family, material, colour, displayInstrument);
        this.stringNo = stringNo;
        this.type = type;
    }

    public int getStringNo() {
        return stringNo;
    }

    public String getType() {
        return type;
    }
}
