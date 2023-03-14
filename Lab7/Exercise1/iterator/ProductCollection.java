import java.util.ArrayList;
import java.util.List;

public class ProductCollection implements Container{
  private ArrayList<Product> products = new ArrayList<>();

  public void add(Product product) {
    products.add(product);
  }

  public Iterator getIterator() {
    return new ProductIterator(products);
   }
}
