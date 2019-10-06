package instruments;

import behaviours.IPlay;
import behaviours.ISell;

public class Piano extends Percussion implements IPlay, ISell {

    private int ports;

    public Piano(String make, String model, Double boughtPrice, Double sellingPrice, String family, String material, String colour, Boolean displayInstrument, String type, int ports) {
        super(make, model, boughtPrice, sellingPrice, family, material, colour, displayInstrument, type);
        this.ports = ports;
    }

    public String play() {
        return "*chop sticks*";
    }

    public int getPorts() {
        return ports;
    }

    public Double calculateMarkUp() {
        return this.getSellingPrice() - this.getBoughtPrice();
    }
}
