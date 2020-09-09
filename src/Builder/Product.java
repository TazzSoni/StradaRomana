/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Builder;

import java.awt.Color;

/**
 *
 * @author guilh
 */
public abstract class Product {
    
    protected Color color;
    
    protected String location;
    
    protected boolean gotPair;

    public boolean gotPair() {
        return gotPair;
    }

    public void setGotPair(boolean gotPair) {
        this.gotPair = gotPair;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
    
}
