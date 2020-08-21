/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author guilh
 */
public class Bag {

    private static Bag instance;
    private List<Ware> wares = new ArrayList<>();
    private List<WagonTile> wagonTiles = new ArrayList<>();
    private List<Cube> cubes = new ArrayList<>();
    private String[] colors = new String[]{"red", "green", "blue", "yellow", "brown", "white"};

    private Bag() {
        createWares();
        createCubes();
    }

    public synchronized static Bag getInstance() {
        if (instance == null) {
            instance = new Bag();
        }

        return instance;
    }

    private void createWares() {
        Ware ware;
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                ware = new Ware(colors[i]);
                wares.add(ware);
            }
        }

        Collections.shuffle(wares);
    }

    private void createCubes() {
        Cube cube;
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                cube = new Cube(colors[i]);
                cubes.add(cube);
            }
        }

        Collections.shuffle(cubes);
    }

    public void createWagonTiles(String[] wagonNames) {
        for (int i = 0; i < 10; i++) {
            WagonTile wagonTile = new WagonTile(wagonNames[i]);
            wagonTiles.add(wagonTile);
        }

        Collections.shuffle(wagonTiles);
        wagonTiles.remove(0);
    }
}
