package colors;

/**
 * GEN-Lab04-refactoring
 * @author Obyka
 * @author batach31
 * @author jerozerbib
 * @file Color
 */

public abstract class Color {

    private final String colorName;

    Color(String colorName) {
        this.colorName = colorName;
    }

    public String toString(){
        return colorName;
    }

}
