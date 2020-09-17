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
public class TakeWagonTileCommand extends Command {


    public TakeWagonTileCommand(GameControl gameControl) {
        super(gameControl);
    }

    @Override
    void execute() {
        gameControl.takeWagonTile();
    }
    
}
