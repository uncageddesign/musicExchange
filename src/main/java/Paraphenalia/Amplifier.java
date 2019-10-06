package Paraphenalia;

public class Amplifier extends Accessories {

    private String model;
    private String type;
    private int size;

    public Amplifier(String brand, Double boughtPrice, Double sellingPrice, String category, String model, String type, int size, InstrumentType instrumentType) {
        super(brand, boughtPrice, sellingPrice, category, instrumentType);
        this.model = model;
        this.type = type;
        this.size = size;
    }

    public String getModel() {
        return model;
    }

    public String getType() {
        return type;
    }

    public int getSize() {
        return size;
    }
}
