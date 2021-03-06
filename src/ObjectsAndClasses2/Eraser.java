package ObjectsAndClasses2;

import java.util.Objects;

public class Eraser {
    private String brand;
    private String color;

    Eraser(String brand, String color){
        this.brand = brand;
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }

    public boolean equals(Eraser eraser){
        boolean areBrandsEqual = Objects.equals(brand, eraser.brand);
        boolean areColorsEqual = Objects.equals(color, eraser.color);

        return areBrandsEqual && areColorsEqual;
    }

    public String toString(){
        String content = "";

        content += "Brand: " + brand +
                "\nColor: " + color;

        return content;
    }
}
