/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package State;

import Model.Wagon;
import java.io.IOException;
import java.util.List;

/**
 *
 * @author guilh
 */
public class Movement {

    protected MovementState movementState;

    public Movement() {
        movementState = new CommonMove();
    }

    public void commonMove() {
        movementState = movementState.commonMove();
    }

    public void sidewaysMove() {
        movementState = movementState.sidewaysMove();
    }

    public void diagonalMove() {
        movementState = movementState.diagonalMove();
    }

    public void extraMove() {
        movementState = movementState.extraMove();
    }

    public void staking() {
        movementState = movementState.staking();
    }

    public Wagon move(Wagon wagon, String wishedLocation, List<String> movementMapping) throws IOException {
        String wagonLocationMapping = null;
        for (String s : movementMapping) {
            if (s.substring(0, 3).equals(wagon.getLocation())) {
                wagonLocationMapping = s;
                break;
            }
        }

        if (wagonLocationMapping == null && (Integer.parseInt(wagon.getLocation())>10)) {
            throw new IOException("Movimentação impossível, tente novamente!");
        }
        return movementState.move(wagon, wishedLocation, wagonLocationMapping);
    }

    public void reset() {
        movementState = new CommonMove();
    }

}
