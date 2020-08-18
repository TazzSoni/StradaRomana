/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Model.Player;
import Singleton.RoundsControl;
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
    RoundsControl round = RoundsControl.getInstance();

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

        String movesTo = boardSide.equals("E") ? "D" : "E";
        for (Integer i = 0; i <= 4; i++) {
            Integer num = numeros.get(i);
            Wagon wagon = new Wagon();
            wagon.setName(num + "");
            wagon.setLocation(num + "");
            wagon.setMovesTo(movesTo);
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

        if (wagon == null) {
            notificaAcaoFalhou("Vagão não encontrado com o nome informado (" + wagonName + ").");
            Thread.currentThread().interrupt();
        }

        if (!isValidMoviment(wagon, wishedLocation)) {
            notificaAcaoFalhou("Movimentação impossível, tente novamente.");
            Thread.currentThread().interrupt();
        }

        try {
            round.addMove(wagon, wishedLocation);
        } catch (Exception ex){
            notificaAcaoFalhou("Você já fez a quantidade máxima de movimentos para esta jogada!");
            Thread.currentThread().interrupt();
        }
        
        wagon.setLocation(wishedLocation);

        notificaMovimentacaoConcluida(wagon.getName(), wagon.getLocation());
    }

    @Override
    public void setActionTypeCommand(String actionType) {
        
    }

    private void notificaMovimentacaoConcluida(String wagonName, String wagonLocation) {
        String stateText = "Movimentação de vagão concluída com sucesso!";
        for (Observer o : observers) {
            o.notificaMovimentacaoConcluida(wagonName, wagonLocation, stateText);
        }
    }

    private void notificaAcaoFalhou(String stateText) {
        for (Observer o : observers) {
            o.notificaAcaoFalhou(stateText);
        }
    }

    private void notificaPlayersCriados() {
        for (Observer o : observers) {
            o.notificaPlayersCriados();
        }
    }

    private boolean isValidMoviment(Wagon wagon, String wishedLocation) {
        return true;
    }

}
