/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visitor;

import Model.Contract;
import Model.Cube;
import Model.Player;
import Model.Score;
import Model.Ware;
import java.awt.Color;
import java.util.HashMap;

/**
 *
 * @author Rodrigo
 */
public class CalculaScore implements Visitor{
	private double valor;
        
    @Override
	public void visit(Score score, Player player) {
        HashMap<Color, Integer> countContracts = new HashMap<>();
        for (Contract c : player.getContracts()) {
            Integer value = countContracts.get(c.getColor()) == null ? 1 : countContracts.get(c.getColor()) + 1;
            countContracts.put(c.getColor(), value);
        }
        
        int colors = countContracts.keySet().size();
        int maxValue = 0;
        
        for(Integer i : countContracts.values()){
            if(i > maxValue){
                maxValue = i;
            }
        }
        
        int contractsScore = colors * maxValue;
        int singleProducts = 0;
        
        for(Ware w : player.getWares()){
            if(!w.gotPair()){
                singleProducts++;
            }
        }
        
        for(Cube c : player.getCubes()){
            if(!c.gotPair()){
                singleProducts++;
            }
        }
        
        contractsScore = contractsScore - singleProducts;
        player.setTotalScore(player.getVictoryPointsFromCoins() + contractsScore);
	}

	
	public double getValor() {
		return valor;
	}
}
