package Paraphenalia;

public class GuitarStrings extends Accessories {

    private String material;
    private String gauges;

    public GuitarStrings(String brand, Double boughtPrice, Double sellingPrice, String category, String material, String gauges, InstrumentType instrumentType) {
        super(brand, boughtPrice, sellingPrice, category, instrumentType);
        this.material = material;
        this.gauges = gauges;
    }

    public String getMaterial() {
        return material;
    }

    public String getGuages() {
        return gauges;
    }


}
