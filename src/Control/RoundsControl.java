/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import AbstractFactory.ActionType;
import Model.Player;
import Model.Wagon;

/**
 *
 * @author guilh
 */
public class RoundsControl {

    private static RoundsControl instance;
    private int qtMoves = 0;
    private int maxQtMoves;
    private ActionType actionType = null;
    private Player player;
    private Wagon lastWagonMoved;

    private RoundsControl() {
    }

    public synchronized static RoundsControl getInstance() {
        if (instance == null) {
            instance = new RoundsControl();
        }

        return instance;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public ActionType getActionType() {
        return actionType;
    }

    public void setActionType(ActionType actionType) {
        this.actionType = actionType;
    }

    public void addMove(Wagon wagon, String wishedLocation) {
        qtMoves++;
        lastWagonMoved = wagon;
    }

    public Player endRound(Player player1, Player player2) {
        qtMoves = 0;
        maxQtMoves = 0;
        actionType = null;
        lastWagonMoved = null;
        player = player == player1 ? player2 : player1;
        
        return player;
    }
    
    public Wagon getLastWagonMoved(){
        return lastWagonMoved;
    }
}
