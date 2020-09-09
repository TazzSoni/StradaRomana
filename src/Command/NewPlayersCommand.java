/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Command;

import Control.GameControl;

/**
 *
 * @author guilh
 */
public class NewPlayersCommand extends Command {

    String player1Name;
    String player2Name;

    public NewPlayersCommand(GameControl gameControl, String player1Name, String player2Name) {
        super(gameControl);
        this.player1Name = player1Name;
        this.player2Name = player2Name;
    }

    @Override
    void execute() {
        gameControl.prepareGameSetup(player1Name, player2Name);
    }

}
