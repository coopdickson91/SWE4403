import java.util.ArrayList;
import java.util.List;

public class ProductIterator implements Iterator {
    ArrayList<Product> products;

    int index = 0;

    public  ProductIterator (ArrayList<Product> products){
        this.products = products;
    }

      public Object next(){
        Product prod =  products.get(index);
        index += 1;
        return prod;
    }
 
    public boolean hasNext(){
        if (index >= products.size() || products.get(index) == null){
            return false;
        }
        else{
           return true; 
        }
    }
}

