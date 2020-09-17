/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Builder.CubeProductGen;
import Builder.ProductGen;
import Builder.Director;
import Builder.WareProductGen;
import java.awt.Color;
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
    private List<Cube> cubes = new ArrayList<>();
    private Color brown = new Color(102, 51, 0);
    private Color[] colors = new Color[]{Color.RED, Color.GREEN, Color.BLUE, Color.YELLOW, brown, Color.WHITE};

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
                ProductGen product = new WareProductGen();
                Director director = new Director(product);
                director.construct(colors[i]);
                ware = (Ware) product.getResult();
                wares.add(ware);
            }
        }

        Collections.shuffle(wares);
    }

    private void createCubes() {
        Cube cube;
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                ProductGen product = new CubeProductGen();
                Director director = new Director(product);
                director.construct(colors[i]);
                cube = (Cube) product.getResult();
                cubes.add(cube);
            }
        }

        Collections.shuffle(cubes);
    }

    public Cube takeCube() {
        Cube cube = cubes.get(0);
        cubes.remove(cube);
        return cube;
    }

    public Ware takeWare() {
        Ware ware = wares.get(0);
        wares.remove(ware);
        return ware;
    }
}
