/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Model.Player;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 *
 * @author guilh
 */
public class GameImplementation implements GameControl {

    Player player1;
    Player player2;
    Random random = new Random();
    List<Observer> observers = new ArrayList<>();

    @Override
    public void setPlayers(String player1Name, String player2Name) {
        player1 = new Player(player1Name);
        player2 = new Player(player2Name);
    }

    @Override
    public void randomizeWagons(String boardSide) {
        ArrayList<Integer> numeros = new ArrayList<>();
        if (boardSide.equals("E")) {
            for (int i = 1; i <= 5; i++) {
                numeros.add(i);
            }
        } else {
            for (int i = 6; i <= 10; i++) {
                numeros.add(i);
            }
        }
        Collections.shuffle(numeros);

        for(Observer o : observers){
            o.notifyRandomizedWagons(numeros);
        }
    }

    private void notifyRandomizedWagons(ArrayList<Integer> numeros) {
        for(Observer o : observers){
            o.notifyRandomizedWagons(numeros);
        }
    }

    @Override
    public void addObserver(Observer o) {
        observers.add(o);
    }

}
