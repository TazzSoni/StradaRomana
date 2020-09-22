/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.Player;

/**
 *
 * @author Rodrigo
 */
public class AdapterTheGame extends TheGame {

    private TheGame theGame;

    public AdapterTheGame(TheGame theGame) {
        this.theGame = theGame;
    }

    public void instanciarTheGame(String player1, String player2) {
        theGame.setParâmetrosIniciais(player1, player2, true);
    }

}
