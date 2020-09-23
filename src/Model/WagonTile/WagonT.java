/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.WagonTile;

import java.util.Collections;

/**
 *
 * @author Rodrigo
 */
public class WagonT implements Item {

    String name;

    public WagonT(String name) {
        this.name = name;
    }
    
    @Override
    public String toString() {
        return name;
    }
    
    @Override
    public Item getWagonTiles(int index) {
        return this;
    }

    @Override
    public void removeItem(int index) {
        
    }

    @Override
    public int size() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void add(Item wagonTiles) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
