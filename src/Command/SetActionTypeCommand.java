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
public class SetActionTypeCommand extends Command {
    
    String actionType;

    public SetActionTypeCommand(GameControl gameControl, String actionType) {
        super(gameControl);
        this.actionType = actionType;
    }

    @Override
    void execute() {
        gameControl.setActionTypeCommand(actionType);
    }
}
