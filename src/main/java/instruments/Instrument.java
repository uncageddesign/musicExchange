package instruments;

import behaviours.IPlay;
import behaviours.ISell;

public abstract class Instrument implements ISell {

    private String make;
    private String model;
    private Double boughtPrice;
    private Double sellingPrice;
    private String family;
    private String material;
    private String colour;
    private Boolean displayInstrument;

    public Instrument(String make, String model, Double boughtPrice, Double sellingPrice, String family, String material, String colour, Boolean displayInstrument){
        this.make = make;
        this.model = model;
        this.boughtPrice = boughtPrice;
        this.sellingPrice = sellingPrice;
        this.family = family;
        this.material = material;
        this.colour = colour;
        this.displayInstrument = displayInstrument;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public Double getBoughtPrice() {
        return boughtPrice;
    }

    public Double getSellingPrice() {
        return sellingPrice;
    }

    public Boolean getDisplayInstrument() {
        return displayInstrument;
    }

    public String getFamily() {
        return family;
    }

    public String getMaterial() {
        return material;
    }

    public String getColour() {
        return colour;
    }

    public Double calculateMarkUp() {
        return this.sellingPrice - this.boughtPrice;
    }
}
