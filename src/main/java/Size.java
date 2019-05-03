public enum Size {

    XS("XS"),
    S("S"),
    M("M"),
    L("L"),
    XL("XL"),
    XXL("XXL"),
    INVALID("Invalid Size");

    private String sizeNotation;

    Size(String sizeNotation) {
        this.sizeNotation = sizeNotation;
    }

    public String toString(){
        return sizeNotation;
    }

}
