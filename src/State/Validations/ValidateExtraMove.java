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
public class ValidateExtraMove extends Validation{
    
    public ValidateExtraMove(){
        
    }
    
    public ValidateExtraMove(Validation otherValidation){
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
