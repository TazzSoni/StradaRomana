/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Builder;

import Model.Cube;
import java.awt.Color;

/**
 *
 * @author guilh
 */
public class CubeProductGen extends ProductGen {
    
    Cube cube;

    @Override
    public Product getResult() {
        return cube;
    }

    @Override
    public void reset() {
        cube = new Cube();
    }

    @Override
    public void construct(Color color) {
        cube.setColor(color);
    }
    
}
