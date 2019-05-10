import java.util.ArrayList;

/***
 * GEN-Lab04-refactoring
 * @author Obyka
 * @author batach31
 * @file OrdersWriter
 */
public class OrdersWriter {
    private ArrayList<Order> orders = new ArrayList();

    public OrdersWriter(ArrayList<Order> orders) {
        this.orders = orders;
    }

    public String getContents() {
        StringBuilder sb = new StringBuilder("{\"orders\": [");

        for (Order order : orders) {
            sb.append(order.toString());
        }

        if (orders.size() > 0) {
            sb.delete(sb.length() - 2, sb.length());
        }

        return sb.append("]}").toString();
    }

    private String getSizeFor(Product product) {
        return product.getSize().toString();
    }

    private String getColorFor(Product product) {
        return product.getColor().toString();
    }
}