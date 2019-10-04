package Paraphenalia;

public abstract class Accessories {

    private String brand;
    private Double boughtPrice;
    private Double sellingPrice;
    private String category;

    public Accessories(String brand, Double boughtPrice, Double sellingPrice, String category){
        this.brand = brand;
        this.boughtPrice = boughtPrice;
        this.sellingPrice = sellingPrice;
        this.category = category;
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
}
