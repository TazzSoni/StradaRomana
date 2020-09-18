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
public abstract class MovementState {
    protected int qtMoves = 0;
    protected int maxQtMoves = 3;
    
    public abstract MovementState commonMove();
    public abstract MovementState diagonalMove();
    public abstract MovementState extraMove();
    public abstract MovementState sidewaysMove();
    public abstract MovementState staking();
    public abstract void move();
}
