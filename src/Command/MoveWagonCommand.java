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
public class MoveWagonCommand extends Command {

    String wagonName;
    String wishedLocation;

    public MoveWagonCommand(GameControl gameControl, String wagonName, String wishedLocation) {
        super(gameControl);
        this.wagonName = wagonName;
        this.wishedLocation = wishedLocation;
    }

    @Override
    void execute() {
        gameControl.moveWagon(wagonName, wishedLocation);
    }
}
