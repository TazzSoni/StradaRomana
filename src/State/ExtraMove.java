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
public class ExtraMove extends MovementState {

    public ExtraMove() {
        maxQtMoves = 4;
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
    public Wagon move(Wagon wagon, String wishedLocation, String movementMapping) throws IOException {
        if (qtMoves < maxQtMoves) {
            if (validationDiagonalMove.validate(wagon, wishedLocation, movementMapping)) {
                qtMoves++;
                wagon.setLocation(wishedLocation);
                return wagon;
            } else {
                throw new IOException("Movimentação impossível, tente novamente!!");
            }
        } else {
            throw new IOException("Você já fez sua quantidade máxima de movimentos neste round.");
        }
    }
}
