/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Model.Player;
import Model.Wagon;
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
    List<Wagon> wagons = new ArrayList<>();

    @Override
    public Player getPlayer1() {
        return player1;
    }
    
    @Override
    public Player getPlayer2() {
        return player2;
    }
    
    @Override
    public void setPlayers(String player1Name, String player2Name) {
        player1 = new Player(player1Name);
        player2 = new Player(player2Name);
        
        notificaPlayersCriados();
    }

    @Override
    public void createWagons(String boardSide) {
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

        String location = boardSide.equals("E") ? "10" : "36";
        String movesTo = boardSide.equals("E") ? "D" : "Ex";
        for (Integer i = 0; i <= 4; i++) {
            Integer num = numeros.get(i);
            Wagon wagon = new Wagon();
            wagon.setName(num + "");
            wagon.setLocation(location + (i+1));
            wagons.add(wagon);
        }

        for (Observer o : observers) {
            o.notifyRandomizedWagons(numeros);
        }
    }

    private void notifyRandomizedWagons(ArrayList<Integer> numeros) {
        for (Observer o : observers) {
            o.notifyRandomizedWagons(numeros);
        }
    }

    @Override
    public void addObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void moveWagon(String wagonName, String wishedLocation) {
        Wagon wagon = null;
        for (Wagon w : wagons) {
            if (w.getName().equals(wagonName)) {
                wagon = w;
                break;
            }
        }
        
        if(wagon == null){
            System.out.println("Vagão não encontrado com o nome informado (" + wagonName + ").");
            Thread.currentThread().interrupt();
        }
        
//        try{
//            jogada.AddPlayerMove();
//        }
        wagon.setLocation(wishedLocation);
        
        notificaMovimentacaoConcluida(wagon.getName(), wagon.getLocation());
    }

    private void notificaMovimentacaoConcluida(String wagonName, String wagonLocation) {
        for(Observer o : observers){
            o.notificaMovimentacaoConcluida(wagonName, wagonLocation);
        }
    }

    private void notificaPlayersCriados() {
        for(Observer o : observers){
           o.notificaPlayersCriados();
        }
    }

}
