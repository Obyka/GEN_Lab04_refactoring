package money;

/**
 * GEN-Lab04-refactoring
 * @author Obyka
 * @author batach31
 * @author jerozerbib
 * @file Currency
 */

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
