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
public class CreateWagonsCommand extends Command {

    String boardSide;

    public CreateWagonsCommand(GameControl gameControl, String boardSide) {
        super(gameControl);
        this.boardSide = boardSide;
    }

    @Override
    void execute() {
        gameControl.getRandomizedWagons(boardSide);
    }
}
