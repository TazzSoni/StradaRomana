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
public abstract class ProductGen {
    
    public abstract void reset();
    
    public abstract Product getResult();
    
    public abstract void construct(Color color);

}
