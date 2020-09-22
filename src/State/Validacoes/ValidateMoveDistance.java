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
        if (Integer.parseInt(wagon.getLocation()) <= 10) {
            if (Integer.parseInt(wagon.getLocation()) < 6) {
                if (wishedLocation.equals("111") || wishedLocation.equals("112") || wishedLocation.equals("113")) {
                    return true;
                } else {
                    return false;
                }
            } else {
                if (wishedLocation.equals("351") || wishedLocation.equals("352")) {
                    return true;
                } else {
                    return false;
                }
            }

        } else {
            String possiblyGoing1 = moveMapping.substring(4, 7);
            String possiblyGoing2 = moveMapping.substring(8, 11);

            if (!wishedLocation.equals(possiblyGoing1) && !wishedLocation.equals(possiblyGoing2) && !(wishedLocation.substring(0, 2).equals(possiblyGoing1.substring(0, 2)))) {
                return false;
            }

            if (otherValidation == null) {
                return true;
            } else {
                return otherValidation.validate(wagon, wishedLocation, moveMapping);
            }
        }
    }
}
