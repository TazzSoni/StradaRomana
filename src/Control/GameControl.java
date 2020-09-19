/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Model.Player;
import Model.WagonTile.WagonTile;
import java.awt.Color;

/**
 *
 * @author guilh
 */
public interface GameControl {

    Player getPlayer1();

    Player getPlayer2();

    void prepareGameSetup(String player1Name, String player2Name);

    void getRandomizedWagons(String boardSide);

    void addObserver(Observer o);

    void moveWagon(String location);

    void takeCube(String cubeLocation);

    void takeWare(String wareLocation);

    String getRoundPlayer();

    public void setActionTypeCommand(String actionType);

    public void endRoundCommand();

    void setCubeLocation(String cubeLocation, Color cubeColor);

    void setWareLocation(String cubeLocation, Color cubeColor);

    void takeWagonTile(String wagonTileName);

    public WagonTile getWagonTile();

    public void setSpecialMoveType(String specialMoveType);

}
