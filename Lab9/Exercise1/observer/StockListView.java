import java.util.ArrayList;
import java.util.List;

public class StockListView {
    public float price;
    private List<Stock> stocks = new ArrayList<>();

    public void addStock(Stock stock) {
        stocks.add(stock);
    }

    public void show() {
        for (var stock : stocks)
            System.out.println(stock.toString());
    }

    public void removeStock(Stock stock) {
        stocks.remove(stock);
    }

    public void updateStock(Stock st, float price) {
        this.price = price;
        for (Stock stock : this.stocks) {
            if(stock == st){
                stock.setPrice(this.price);
            }
        }
    }
}
