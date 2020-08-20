package Model;

import java.util.ArrayList;

public class Player {

    private String name;
    private String coins;
    private ArrayList<Cube> cubes = new ArrayList<>();
    private ArrayList<Ware> wares = new ArrayList<>();

    public Player(String name) {
        this.name = name;
    }

    public ArrayList<Cube> getCubes() {
        return cubes;
    }
    public ArrayList<Ware> getWares() {
        return wares;
    }

    public void addCubes(Cube cubes) {
        this.cubes.add(cubes);
    }
    public void addWares(Ware wares) {
        this.wares.add(wares);
    }
    
    public String getName() {
        return name;
    }

    public String getCoins() {
        return coins;
    }

    public void setCoins(String coins) {
        this.coins = coins;
    }
}
