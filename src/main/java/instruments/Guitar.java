package instruments;

import behaviours.IPlay;
import behaviours.ISell;

public class Guitar extends Stringed implements IPlay, ISell {

    private String fretMaterial;
    private String soundHole;

    public Guitar(String make, String model, Double boughtPrice, Double sellingPrice, String family, String material, String colour, Boolean displayInstrument, int stringNo, String type, String fretMaterial, String soundHole) {
        super(make, model, boughtPrice, sellingPrice, family, material, colour, displayInstrument, stringNo, type);
        this.fretMaterial = fretMaterial;
        this.soundHole = soundHole;
    }

    public String getFretMaterial() {
        return fretMaterial;
    }

    public String getSoundHole() {
        return soundHole;
    }

    public String play() {
        return "*gently weeps*";
    }
}
