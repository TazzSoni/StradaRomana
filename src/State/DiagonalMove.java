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
public class DiagonalMove extends MovementState {
    
    public DiagonalMove(){
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
    public Wagon move(Wagon wagon, String wishedLocation, String moveMapping) throws IOException {
        if (validationDiagonalMove.validate(wagon, wishedLocation, moveMapping)) {
            qtMoves++;
            wagon.setLocation(wishedLocation);
            return wagon;
        } else {
            throw new IOException("Movimentação impossível, tente novamente!!");
        }
    }
}
