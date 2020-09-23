/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package State.Validations;

import Control.GameImplementation;
import Model.Wagon;
import java.io.IOException;

/**
 *
 * @author guilh
 */
public class ValidateStaking extends Validation{
    
    public ValidateStaking(){
        
    }
    
    public ValidateStaking(Validation otherValidation){
        super(otherValidation);
    }

    @Override
    public boolean validate(Wagon wagon, String wishedLocation, String moveMapping) {
        if (GameImplementation.getWagonByLocation(wishedLocation) != null){
            return true;
        }
        
        if (otherValidation == null) {
            return true;
        } else {
            return otherValidation.validate(wagon, wishedLocation, moveMapping);
        }
    }
    
}
