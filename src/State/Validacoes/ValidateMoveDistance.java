/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package State.Validacoes;

import Model.Wagon;
import java.io.IOException;

/**
 *
 * @author guilh
 */
public class ValidateMoveDistance extends Validation {

    public ValidateMoveDistance() {

    }

    public ValidateMoveDistance(Validation otherValidation) {
        super(otherValidation);
    }

    @Override
    public boolean validate(Wagon wagon, String wishedLocation, String moveMapping) {
        String possiblyGoing1 = moveMapping.substring(4, 7);
        String possiblyGoing2 = moveMapping.substring(8, 11);

        if (!wishedLocation.equals(possiblyGoing1) && !wishedLocation.equals(possiblyGoing2) && (wishedLocation.charAt(1) != wagon.getLocation().charAt(1))) {
            return false;
        }

        if (otherValidation == null) {
            return true;
        } else {
            return otherValidation.validate(wagon, wishedLocation, moveMapping);
        }
    }

}
