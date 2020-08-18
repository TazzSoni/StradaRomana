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

    Player getPlayer2();

    void setPlayers(String player1Name, String player2Name);

    void createWagons(String boardSide);

    void addObserver(Observer o);

    void moveWagon(String wagonName, String wishedPosition);

}
