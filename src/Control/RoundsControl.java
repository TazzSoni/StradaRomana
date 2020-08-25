/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import AbstractFactory.ActionType;
import AbstractFactory.MovimentarWagon;
import Model.Contract;
import Model.Cube;
import Model.Player;
import Model.Wagon;
import Model.Ware;
import java.awt.Color;

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
        if (actionType.getAcao().equals("Movimentar wagon")) {
            maxQtMoves = 3;
        }
    }

    public void addMove(Wagon wagon, String wishedLocation) throws Exception {
        if (qtMoves < maxQtMoves) {
            qtMoves++;
            lastWagonMoved = wagon;
        } else {
            throw new Exception();
        }
    }

    public Player endRound(Player player1, Player player2) {
        qtMoves = 0;
        maxQtMoves = 0;
        actionType = null;
        lastWagonMoved = null;
        player = player == player1 ? player2 : player1;

        return player;
    }

    public Wagon getLastWagonMoved() {
        return lastWagonMoved;
    }

    public void checkNewContract(Color color) {
        Cube cube = null;
        for (Cube c : player.getCubes()) {
            if (c.getColor() == color && !c.gotPair()) {
                cube = c;
                break;
            }
        }

        Ware ware = null;
        for (Ware w : player.getWares()) {
            if (w.getColor() == color && !w.gotPair()) {
                ware = w;
                break;
            }
        }

        if (cube != null && ware != null) {
            cube.setGotPair(true);
            ware.setGotPair(true);
            Contract contract = new Contract();
            contract.setCube(cube);
            contract.setWare(ware);
            player.addContract(contract);
            System.out.println("criou contrato");
        }
    }
}
