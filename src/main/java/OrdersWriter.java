import java.util.ArrayList;

/***
 * GEN-Lab04-refactoring
 * @author Obyka
 * @author batach31
 * @author jerozerbib
 * @file OrdersWriter
 */
public class OrdersWriter {
    private final ArrayList<Order> orders;

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
}