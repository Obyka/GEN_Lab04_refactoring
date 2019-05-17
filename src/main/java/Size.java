public enum Size {

    XS("XS"),
    S("S"),
    M("M"),
    L("L"),
    XL("XL"),
    XXL("XXL"),
    INVALID("Invalid Size");

    private final String sizeNotation;

    Size(String sizeNotation) {
        this.sizeNotation = sizeNotation;
    }

    public String toString(){
        return sizeNotation;
    }

}
