/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package State.Validacoes;

import Model.Wagon;

/**
 *
 * @author guilh
 */
public class ValidateDiagonalMove extends Validation {

    public ValidateDiagonalMove() {

    }

    public ValidateDiagonalMove(Validation otherValidation) {
        super(otherValidation);
    }

    @Override
    public boolean validate(Wagon wagon, String wishedLocation, String moveMapping) {
        if (otherValidation == null) {
            return true;
        } else {
            return otherValidation.validate(wagon, wishedLocation, moveMapping);
        }
    }
}
