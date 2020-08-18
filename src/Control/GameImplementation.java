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
        
        round.setPlayer(player1);

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
            Wagon wagon = new Wagon(movesTo);
            wagon.setLocation(num + "");
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
    public void moveWagon(String wagonLocation, String wishedLocation) {
        Wagon wagon = null;
        for (Wagon w : wagons) {
            if (w.getLocation().equals(wagonLocation)) {
                wagon = w;
                break;
            }
        }

        if (wagon == null) {
            notificaAcaoFalhou("Vagão não encontrado no botão informado (" + wagonLocation + ").");
            return;
        }

        if (!isValidMoviment(wagon, wishedLocation)) {
            notificaAcaoFalhou("Movimentação impossível, tente novamente.");
            return;
        }

        try {
            round.addMove(wagon, wishedLocation);
        } catch (Exception ex){
            notificaAcaoFalhou("Você já fez a quantidade máxima de movimentos para esta jogada!");
            return;
        }
        
        wagon.setLocation(wishedLocation);

        notificaMovimentacaoConcluida(wagonLocation, wagon.getLocation());
    }

    @Override
    public void setActionTypeCommand(String actionType) {
        round.setActionType(actionType);
        
        notificaTipoDeAcaoDefinido("Ação definida com sucesso. Você não poderá escolher outra ação até seu próximo round!");
    }

    @Override
    public void endRoundCommand() {
        Player nextPlayer = round.endRound(player1, player2);
        notificaRoundFinalizado("Round finalizado! O próximo turno é de " + nextPlayer.getName());
    }

    private void notificaMovimentacaoConcluida(String previousWagonLocation, String wagonLocation) {
        String stateMessage = "Movimentação de vagão concluída com sucesso!";
        for (Observer o : observers) {
            o.notificaMovimentacaoConcluida(previousWagonLocation, wagonLocation, stateMessage);
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

    private void notificaTipoDeAcaoDefinido(String actionDefinedMessage) {
        for (Observer o : observers) {
            o.notificaTipoDeAcaoDefinido(actionDefinedMessage);
        }
    }

    private void notificaRoundFinalizado(String endRoundMesssage) {
        for (Observer o : observers){
            o.notificaRoundFinalizado(endRoundMesssage);
        }
    }

}
