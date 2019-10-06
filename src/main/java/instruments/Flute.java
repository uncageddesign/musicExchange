package instruments;

import behaviours.IPlay;
import behaviours.ISell;

public class Flute extends Woodwind implements ISell, IPlay {

    private String experienceLevel;

    public Flute(String make, String model, Double boughtPrice, Double sellingPrice, String family, String material, String colour, Boolean displayInstrument, String reed, String type, String experienceLevel) {
        super(make, model, boughtPrice, sellingPrice, family, material, colour, displayInstrument, reed, type);
        this.experienceLevel = experienceLevel;
    }

    public String play() {
        return "*Lizzo rocking out*";
    }

    public String getExperienceLevel() {
        return experienceLevel;
    }
}
