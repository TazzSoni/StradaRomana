package Model;

import java.util.ArrayList;

public class Player {

    private String name;
    private int coins = 0;
    private int victoryPoints = 0;
    private ArrayList<Cube> cubes = new ArrayList<>();
    private ArrayList<Ware> wares = new ArrayList<>();
    private ArrayList<Contract> contracts = new ArrayList<>();

    public Player(String name) {
        this.name = name;
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

      public void addCoins(int value) {
          this.coins += value;
    }

    public int getVictoryPoints() {
        return victoryPoints;
    }

    public void setVictoryPoints(int victoryPoints) {
        this.victoryPoints = victoryPoints;
    }

    public ArrayList<Contract> getContracts() {
        return contracts;
    }

    public void addContract(Contract contract) {
        this.contracts.add(contract);
    }
      
}
