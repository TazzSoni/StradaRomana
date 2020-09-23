/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package State;

import Model.Wagon;
import State.Validations.ValidateMoveDistance;
import State.Validations.ValidateSidewayMove;
import State.Validations.Validation;
import State.Validations.ValidateCommonMove;
import State.Validations.ValidateDiagonalMove;
import State.Validations.ValidateExtraMove;
import State.Validations.ValidateStaking;
import java.io.IOException;
import java.util.List;

/**
 *
 * @author guilh
 */
public abstract class MovementState {

    protected int qtMoves = 0;
    protected int maxQtMoves = 3;
    protected Validation validationCommonMove = new ValidateCommonMove(new ValidateMoveDistance());
    protected Validation validationSidewayMove = new ValidateSidewayMove(new ValidateMoveDistance());
    protected Validation validationDiagonalMove = new ValidateDiagonalMove(new ValidateMoveDistance());
    protected Validation validationExtraMove = new ValidateExtraMove(new ValidateMoveDistance());
    protected Validation validationStaking = new ValidateStaking(new ValidateSidewayMove(new ValidateMoveDistance()));

    public abstract MovementState commonMove();

    public abstract MovementState diagonalMove();

    public abstract MovementState extraMove();

    public abstract MovementState sidewaysMove();

    public abstract MovementState staking();

    public abstract Wagon move(Wagon wagon, String wishedLocation, String movementMapping) throws IOException;

    public void setQtMoves(int qtMoves) {
        this.qtMoves = qtMoves;
    }

    public void validateMoveDistance(Wagon wagon, String wishedLocation, String moveMapping) throws IOException {
        String possiblyGoing1 = moveMapping.substring(4, 7);
        String possiblyGoing2 = moveMapping.substring(8, 11);

        if (!wishedLocation.equals(possiblyGoing1) && !wishedLocation.equals(possiblyGoing2) && (wishedLocation.charAt(1) != wagon.getLocation().charAt(1))) {
            throw new IOException("Movimentação impossível, tente novamente!");
        }
    }
}
