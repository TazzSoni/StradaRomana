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
public class CommonMove extends MovementState {

    public CommonMove() {
    }

    @Override
    public MovementState commonMove() {
        return new CommonMove();
    }

    @Override
    public MovementState diagonalMove() {
        return new DiagonalMove();
    }

    @Override
    public MovementState extraMove() {
        return new ExtraMove();
    }

    @Override
    public MovementState sidewaysMove() {
        return new SidewaysMove();
    }

    @Override
    public MovementState staking() {
        return new Staking();
    }
    
    @Override
    public void move(){
        
    }

}
