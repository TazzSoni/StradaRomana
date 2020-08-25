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
public class ProductGenerator {
    
    private ProductGen productGen;
    
    public ProductGenerator(ProductGen productGen){
        this.productGen = productGen;
    }
    
    public void construct(Color color){
        productGen.reset();
        
        productGen.construct(color);
    }
    
}