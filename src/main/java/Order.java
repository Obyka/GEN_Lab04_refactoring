import java.util.ArrayList;
import java.util.List;

/***
 * GEN-Lab04-refactoring
 * @author Obyka
 * @author batach31
 * @file Order
 */

public class Order {
    private List<Product> products = new ArrayList<>();
    private int id;

    public Order(int id) {
        this.id = id;
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

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        sb.append("\"id\": ");
        sb.append(id);
        sb.append(", ");
        sb.append("\"products\": [");
        for (int j = 0; j < getProductsCount(); j++) {
            Product product = getProduct(j);
            sb.append(product.toString());
        }

        if (getProductsCount() > 0) {
            sb.delete(sb.length() - 2, sb.length());
        }

        sb.append("]");
        sb.append("}, ");

        return sb.toString();
    }
}
