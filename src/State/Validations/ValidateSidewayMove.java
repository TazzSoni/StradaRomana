/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package State.Validations;

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
        if (wishedLocation.substring(0, 2).equals(wagon.getLocation().substring(0, 2))) {
            if (wishedLocation.substring(0, 2).equals("11") || wishedLocation.substring(0, 2).equals("31")) {
                if ((wishedLocation.charAt(2) == '1' && wagon.getLocation().charAt(2) == '2') || (wishedLocation.charAt(2) == '2' && wagon.getLocation().charAt(2) == '1')) {
                    return false;
                }
            }
            return true;
        }

        if (otherValidation == null) {
            return true;
        } else {
            return otherValidation.validate(wagon, wishedLocation, moveMapping);
        }
    }
}
