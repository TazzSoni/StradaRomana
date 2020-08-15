/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

/**
 *
 * @author guilh
 */
public interface GameControl {

    public void setPlayers(String player1Name, String player2Name);

    public void createWagons(String boardSide);

    public void addObserver(Observer o);
    
}
