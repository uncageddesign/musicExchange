package instruments;

import behaviours.IPlay;
import behaviours.ISell;

public class Trumpet extends Brass implements ISell, IPlay {

    private String experienceLevel;

    public Trumpet(String make, String model, Double boughtPrice, Double sellingPrice, String family, String material, String colour, Boolean displayInstrument, int bore, String key, String experienceLevel) {
        super(make, model, boughtPrice, sellingPrice, family, material, colour, displayInstrument, bore, key);
        this.experienceLevel = experienceLevel;
    }

    public String getExperienceLevel() {
        return experienceLevel;
    }

    public String play() {
        return "*jazz solo*";
    }
}
