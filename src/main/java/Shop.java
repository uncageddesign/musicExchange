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
        Double total = 0.00;
        for (ISell item: this.stock){
            total += item.calculateMarkUp();
        }
        return total;
    }

}
