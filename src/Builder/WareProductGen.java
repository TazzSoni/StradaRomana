/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Builder;

import Model.Ware;
import java.awt.Color;

/**
 *
 * @author guilh
 */
public class WareProductGen extends ProductGen {
    
    Ware ware;

    @Override
    public Product getResult() {
        return ware;
    }

    @Override
    public void reset() {
        ware = new Ware();
    }

    @Override
    public void construct(Color color) {
        ware.setColor(color);
        ware.setGotPair(false);
    }
    
}
