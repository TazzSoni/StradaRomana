/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Command;

import Control.GameControl;

/**
 *
 * @author Rodrigo
 */
public class TakeWareCommand extends Command {

    String wareLocation;

    public TakeWareCommand(GameControl gameControl, String wareLocation) {
        super(gameControl);
        this.wareLocation = wareLocation;
    }

    @Override
    void execute() {
        gameControl.takeWare(wareLocation);
    }
}