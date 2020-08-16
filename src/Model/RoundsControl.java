/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author guilh
 */
public class RoundsControl {

    private static RoundsControl instance;
    private int qtdMoves = 0;

    private RoundsControl() {
    }

    public synchronized static RoundsControl getInstance() {
        if (instance == null) {
            instance = new RoundsControl();
        }

        return instance;
    }

    public void addMove(Wagon wagon, String wishedLocation) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
