/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author guilh
 */
public class Bag {
    
    private static Bag instance;
    
    private Bag() {
    }

    public synchronized static Bag getInstance() {
        if (instance == null) {
            instance = new Bag();
        }

        return instance;
    }
    
}
