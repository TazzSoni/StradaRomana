package Model;

import java.awt.Color;

public class Cube {

    private Color color;
    
    private String location;
    
    public Cube(Color color) {
        this.color = color;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Color getColor() {
        return color;
    }
    
}
