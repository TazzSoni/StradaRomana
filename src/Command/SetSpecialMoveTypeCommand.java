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
public class SetSpecialMoveTypeCommand extends Command {
    String specialMoveType;
    
    public SetSpecialMoveTypeCommand(GameControl gameControl, String specialMoveType) {
        super(gameControl);
        this.specialMoveType = specialMoveType;
    }

    @Override
    void execute() {
        gameControl.setSpecialMoveType(specialMoveType);
    }
}
