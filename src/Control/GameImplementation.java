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
public class GameImplementation implements GameControl {
    
    Player player1;
    Player player2;

    @Override
    public void setPlayers(String player1Name, String player2Name) {
        player1 = new Player(player1Name);
        player2 = new Player(player2Name);
    }
    
}
