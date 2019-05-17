import colors.Blue;
import colors.Red;
import money.Currency;
import money.Money;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;
/***
 * GEN-Lab04-refactoring
 * @author Obyka
 * @author batach31
 * @file OrdersWriterTest
 */
import colors.Blue;
import colors.Red;
import money.Currency;
import money.Money;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;
/***
 * GEN-Lab04-refactoring
 * @author Obyka
 * @author batach31
 * @file OrdersWriterTest
 */
public class OrdersWriterTest {
    ArrayList<Order> orders = new ArrayList<>();
    Order order111 = new Order(111);

    @BeforeEach
    public void firstOrderSetUp() {
        orders.add(order111);
    }

    @Test
    public void outputForNoOrderShouldLookLike() {
        assertEquals("{\"orders\": []}", new OrdersWriter(new ArrayList<>()).getContents());
    }

    @Test
    public void outputForOneOrderWithoutProductShouldLookLike() {
        String order111 = "{\"id\": 111, \"products\": []}";
        assertEquals("{\"orders\": [" + order111 + "]}", new OrdersWriter(orders).getContents());
    }

    @Test
    public void outputForTwoOrdersWithoutProductShouldLookLike() {
        orders.add(new Order(222));

        String order111Json = JsonOrder111WithProduct("");
        String order222Json = "{\"id\": 222, \"products\": []}";
        assertEquals("{\"orders\": [" + order111Json + ", " + order222Json + "]}", new OrdersWriter(orders).getContents());
    }

    @Test
    public void outputForOneOrderWithOneProductShouldLookLike() {
        order111.AddProduct(new Product("Shirt", new Blue(), Size.M, new Money(Currency.TWD, 2.99)));

        String order111Json = JsonOrder111WithProduct("{\"code\": \"Shirt\", \"color\": \"blue\", \"size\": \"M\", \"price\": 2.99, \"currency\": \"TWD\"}");
        assertEquals("{\"orders\": [" + order111Json + "]}", new OrdersWriter(orders).getContents());
    }

    @Test
    public void outputForOneOrderWithOneProductWhithoutSizeShouldLookLike() {
        order111.AddProduct(new Product("Pot", new Red(), Size.INVALID, new Money(Currency.SGD, 16.5)));

        String order111Json = JsonOrder111WithProduct("{\"code\": \"Pot\", \"color\": \"red\", \"price\": 16.5, \"currency\": \"SGD\"}");
        assertEquals("{\"orders\": [" + order111Json + "]}", new OrdersWriter(orders).getContents());
    }

    private String JsonOrder111WithProduct(String productJson) {
        return "{\"id\": 111, \"products\": [" + productJson + "]}";
    }
}

