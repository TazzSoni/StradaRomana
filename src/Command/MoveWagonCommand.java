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

    String location;

    public MoveWagonCommand(GameControl gameControl, String location) {
        super(gameControl);
        this.location = location;
    }

    @Override
    void execute() {
        gameControl.moveWagon(location);
    }
}
