/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactory;

/**
 *
 * @author tasso
 */
public class MovimentarWagonFactory extends ActionFactory {

    @Override
    public Action definirAcao() {
        return new MovimentarWagon();
    }
    
}
