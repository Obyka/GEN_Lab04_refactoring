package colors;

public abstract class Color {

    /*BLUE("blue"),
    RED("red"),
    YELLOW("yellow"),
    UNCOLOR("no color");*/

    private String colorName;

    Color(String colorName) {
        this.colorName = colorName;
    }

    public String toString(){
        return colorName;
    }

}
