package Paraphenalia;

public class GuitarStrings extends Accessories {

    private String material;
    private String gauges;

    public GuitarStrings(String brand, Double boughtPrice, Double sellingPrice, String category, String material, String gauges) {
        super(brand, boughtPrice, sellingPrice, category);
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
