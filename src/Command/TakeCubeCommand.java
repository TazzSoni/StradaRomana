package Command;

import Control.GameControl;

public class TakeCubeCommand extends Command {

    String cubeLocation;

    public TakeCubeCommand(GameControl gameControl, String cubeLocation) {
        super(gameControl);
        this.cubeLocation = cubeLocation;
    }

    @Override
    void execute() {
        gameControl.takeCube(cubeLocation);
    }
}