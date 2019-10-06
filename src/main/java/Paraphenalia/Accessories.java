package Paraphenalia;

import behaviours.ISell;

public abstract class Accessories implements ISell {

    private String brand;
    private Double boughtPrice;
    private Double sellingPrice;
    private String category;
    private InstrumentType instrumentType;

    public Accessories(String brand, Double boughtPrice, Double sellingPrice, String category, InstrumentType instrumentType){
        this.brand = brand;
        this.boughtPrice = boughtPrice;
        this.sellingPrice = sellingPrice;
        this.category = category;
        this.instrumentType = instrumentType;
    }

    public String getBrand() {
        return brand;
    }

    public Double getBoughtPrice() {
        return boughtPrice;
    }

    public Double getSellingPrice() {
        return sellingPrice;
    }

    public String getCategory() {
        return category;
    }

    public Double calculateMarkUp() {
        return this.sellingPrice - this.boughtPrice;
    }

    public InstrumentType getInstrumentType() {
        return instrumentType;
    }
}
