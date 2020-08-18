/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Singleton;

import Model.Wagon;

/**
 *
 * @author guilh
 */
public class RoundsControl {

    private static RoundsControl instance;
    private int qtMoves = 0;
    private int maxQtMoves;
    private String actionType;

    public String getActionType() {
        return actionType;
    }

    public void setActionType(String actionType) {
        this.actionType = actionType;
    }

    private RoundsControl() {
    }

    public synchronized static RoundsControl getInstance() {
        if (instance == null) {
            instance = new RoundsControl();
        }

        return instance;
    }

    public void addMove(Wagon wagon, String wishedLocation) {
        qtMoves++;
    }

}
