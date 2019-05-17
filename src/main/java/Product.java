import colors.Color;
import money.*;

/***
 * GEN-Lab04-refactoring
 * @author Obyka
 * @author batach31
 *
 */
public class Product {
    private final String code;
    private final Color color;
    private final Size size;
    private Money money;

    public Product(String code, Color color, Size size, Money money) {
        this.code = code;
        this.color = color;
        this.size = size;
        this.money = money;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        sb.append("\"code\": \"");
        sb.append(code);
        sb.append("\", ");
        sb.append("\"color\": \"");
        sb.append(color);
        sb.append("\", ");

        if (!size.equals(Size.INVALID)) {
            sb.append("\"size\": \"");
            sb.append(size);
            sb.append("\", ");
        }

        sb.append("\"price\": ");
        sb.append(money.getAmount());
        sb.append(", ");
        sb.append("\"currency\": \"");
        sb.append(money.getCurrency());
        sb.append("\"}, ");

        return sb.toString();
    }
}