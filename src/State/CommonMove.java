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
public class CommonMove extends MovementState {

    public CommonMove() {
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
    public Wagon move(Wagon wagon, String wishedLocation, String wagonPositionMapping) throws IOException {
        boolean verifica = validationCommonMove.validate(wagon, wishedLocation, wagonPositionMapping);
        if(Integer.parseInt(wishedLocation) <=10){
             switch (wagon.getLocation()) {
                case "111":
                    if (((Integer.parseInt(wishedLocation) >= 6) && (Integer.parseInt(wishedLocation) <= 10))
                            || (Integer.parseInt(wagon.getName()) < 6)) {
                        verifica = false;
                    }else{
                        verifica = true;
                    }
                    break;
                case "112":
                    if (((Integer.parseInt(wishedLocation) >= 6) && (Integer.parseInt(wishedLocation) <= 10))
                            || (Integer.parseInt(wagon.getName()) < 6)) {
                        verifica = false;
                    }else{
                        verifica = true;
                    }
                    break;
                case "113":
                    if (((Integer.parseInt(wishedLocation) >= 6) && (Integer.parseInt(wishedLocation) <= 10))
                            || (Integer.parseInt(wagon.getName()) < 6)) {
                        verifica = false;
                    }else{
                        verifica = true;
                    }
                    break;
                case "351":
                    if ((Integer.parseInt(wishedLocation) < 6)  || (Integer.parseInt(wagon.getName()) > 5)) {
                        verifica = false;
                    }else{
                        verifica = true;
                    }
                    break;
                case "352":
                    if ((Integer.parseInt(wishedLocation) < 6)  || (Integer.parseInt(wagon.getName()) > 5)) {
                        verifica = false;
                    }else{
                        verifica = true;
                    }
                    break;
            }
        }
        if (qtMoves < maxQtMoves) {
            if (verifica) {
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
