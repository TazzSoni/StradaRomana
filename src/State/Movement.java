/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package State;

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

    public void move() {
        movementState.move();
    }

    public void reset() {
        movementState = new CommonMove();
    }

}
