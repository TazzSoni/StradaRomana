package Command;

import Control.GameControl;

public abstract class Command {
    
    protected GameControl gameControl;

    public Command(GameControl gameControl) {
        this.gameControl = gameControl;
    }
    
    abstract void execute();
}
