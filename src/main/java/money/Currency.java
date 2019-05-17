package money;

public enum Currency {

    TWD("TWD"),
    SGD("SGD");

    private final String currencyName;

    Currency(String currencyName) {
        this.currencyName = currencyName;
    }

    public String toString(){
        return currencyName;
    }

}
