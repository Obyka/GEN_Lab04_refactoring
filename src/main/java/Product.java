import colors.Color;

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
    private final double price;
    private final Currency currency;

    public Product(String code, Color color, Size size, double price, Currency currency) {
        this.code = code;
        this.color = color;
        this.size = size;
        this.price = price;
        this.currency = currency;
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
        sb.append(price);
        sb.append(", ");
        sb.append("\"currency\": \"");
        sb.append(currency);
        sb.append("\"}, ");

        return sb.toString();
    }
}