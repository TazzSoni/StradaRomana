/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Model.Player;

/**
 *
 * @author guilh
 */
public interface GameControl {

    Player getPlayer1();

    public void createWagons(String boardSide);

    public void addObserver(Observer o);

    public void moveWagon(String wagonName, String wishedPosition);
    
}
