import java.util.ArrayList;
import java.util.List;

/***
 * GEN-Lab04-refactoring
 * @author Obyka
 * @author batach31
 * @file Order
 */

public class Order {
    private List<Product> products = new ArrayList<Product>();
    private int id;

    public Order(int id) {
        this.id = id;
    }

    public int getOrderId() {
        return id;
    }

    public int getProductsCount() {
        return products.size();
    }

    public Product getProduct(int j) {
        return products.get(j);
    }

    public void AddProduct(Product product) {
        products.add(product);
    }
}
