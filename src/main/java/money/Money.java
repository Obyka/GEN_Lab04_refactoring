package money;

public class Money {
    private Currency currency;
    private int centsAmount;

    private Money(Currency currency, int centsAmount) {
        this.currency = currency;
        this.centsAmount = centsAmount;
    }

    public Money(Currency currency, double amount) {
        this(currency, (int) (amount * 100));
    }

    public Currency getCurrency() {
        return currency;
    }

    private int getCentsAmount() {
        return centsAmount;
    }

    public double getAmount(){
        return getCentsAmount() / 100.0;
    }
}
