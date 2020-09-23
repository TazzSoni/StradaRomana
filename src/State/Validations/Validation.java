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
public abstract class Validation {
    
    protected Validation otherValidation;
    public abstract boolean validate(Wagon wagon, String wishedLocation, String moveMapping);
    
    public Validation (){
        
    }
    
    public Validation (Validation validation){
        otherValidation = validation;
    }
}
