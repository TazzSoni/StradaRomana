/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Visitor.Visitor;

/**
 *
 * @author Rodrigo
 */
public class Score {

    private int victoryPointsFromCoins = 0;
    private int totalScore = 0;
    private Player player;

    public int getVictoryPointsFromCoins() {
        return victoryPointsFromCoins;
    }

    public void setVictoryPointsFromCoins(int victoryPointsFromCoins) {
        this.victoryPointsFromCoins = victoryPointsFromCoins;
    }

    void setTotalScore(int totalScore) {
        this.totalScore = totalScore;
    }

    int getTotalScore() {
        return this.totalScore;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }
    
    public void accept(Visitor visitor) throws Exception {
		visitor.visit(this, player);
	}

}
