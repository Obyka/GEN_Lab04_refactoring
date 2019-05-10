package colors;

public abstract class Color {

    private String colorName;

    Color(String colorName) {
        this.colorName = colorName;
    }

    public String toString(){
        return colorName;
    }

}
