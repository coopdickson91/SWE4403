public class Demo{
    public static void main(String[] args){

        Stock apl = new Stock("APPL", 20.50f);
        Stock glg = new Stock("GOOGL", 50.50F);
        StockListView observable = new StockListView();

        observable.addStock(apl);
        observable.addStock(glg);

        observable.show();

        System.out.println("UPDATE");
        observable.updateStock(apl, 19.99f);
        observable.updateStock(glg, 13.99f);

        observable.show();
    }


}