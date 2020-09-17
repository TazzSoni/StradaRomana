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

private String wagonTileName;
    
    public TakeWagonTileCommand(GameControl gameControl, String wagonTileName) {
        super(gameControl);
        this.wagonTileName = wagonTileName;
    }

    @Override
    void execute() {
        gameControl.takeWagonTile(wagonTileName);
    }
    
}
