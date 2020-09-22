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
public class ValidateSidewayMove extends Validation {

    public ValidateSidewayMove(Validation otherValidation) {
        super(otherValidation);
    }

    public ValidateSidewayMove() {

    }

    @Override
    public boolean validate(Wagon wagon, String wishedLocation, String moveMapping) {
        if (!wagon.getLocation().substring(0,2).equals(wishedLocation.substring(0,2))) {
            return false;
        }

        if (otherValidation == null) {
            return true;
        } else {
            return otherValidation.validate(wagon, wishedLocation, moveMapping);
        }
    }
}
