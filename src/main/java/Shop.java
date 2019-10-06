import behaviours.ISell;
import instruments.Instrument;

import java.util.ArrayList;

public class Shop {

    private String name;
    private ArrayList<ISell> stock;
    Instrument instrument;

    public Shop(String name){
        this.name = name;
        this.stock = new ArrayList<ISell>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<ISell> getStock() {
        return stock;
    }

    public int stockCount(){
        return stock.size();
    }

    public void addToStock(ISell item){
        stock.add(item);
    }

    public void removeStock(ISell index) {
        stock.remove(index);
    }

    public Double totalMarkUp(){
        //loop through stock array
        Double total = 0.00;
        for(int i = 0; i < stock.size(); i++){
            //calculate the markup for each item
            Double item = stock.getSellingPrice() - stock.getBoughtPrice();
            double newTotal = total + item;
        }
        //add together and return
        return total;
    }
}
