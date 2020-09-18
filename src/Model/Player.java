package Model;

import Visitor.Visitor;
import java.util.ArrayList;

public class Player {

    private String name;
    private int coins = 0;
    private ArrayList<Cube> cubes = new ArrayList<>();
    private ArrayList<Ware> wares = new ArrayList<>();
    private ArrayList<Contract> contracts = new ArrayList<>();
    private Score score = new Score();

    public Player(String name) {
        this.name = name;
        score.setPlayer(this);
    }

    public ArrayList<Cube> getCubes() {
        return cubes;
    }
    public ArrayList<Ware> getWares() {
        return wares;
    }

    public void addCube(Cube cube) {
        this.cubes.add(cube);
    }
    public void addWare(Ware ware) {
        this.wares.add(ware);
    }
    
    public String getName() {
        return name;
    }

    public int getCoins() {
        return coins;
    }

    public void setCoins(int coins) {
        this.coins = coins;
    }

      public void addCoins(int value) {
          this.coins += value;
    }

    public int getVictoryPointsFromCoins() {
        return score.getVictoryPointsFromCoins();
    }

    public void setVictoryPointsFromCoins(int victoryPointsFromCoins) {
        this.score.setVictoryPointsFromCoins(victoryPointsFromCoins);
    }

    public ArrayList<Contract> getContracts() {
        return contracts;
    }

    public void addContract(Contract contract) {
        this.contracts.add(contract);
    }

    public int getTotalScore() {
        return score.getTotalScore();
    }

    public void setTotalScore(int totalScore) {
        this.score.setTotalScore(totalScore);
    }
    
    public void accept(Visitor visitor) throws Exception {
		score.accept(visitor);
	}
      
}
