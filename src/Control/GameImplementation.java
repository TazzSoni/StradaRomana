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

    private Player player1;
    private Player player2;
    private Random random = new Random();
    private List<Observer> observers = new ArrayList<>();
    private List<Wagon> wagons = new ArrayList<>();
    private RoundsControl round = RoundsControl.getInstance();

    String previousLocation;
    String wishedLocation;
    private boolean isPreviousLocation = true;

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

        if (boardSide.equals("E")) {
            observers.forEach((o) -> {
                o.notifyRandomizedWagonsE(numeros);
            });
        } else {
            observers.forEach((o) -> {
                o.notifyRandomizedWagonsD(numeros);
            });
        }
    }

    @Override
    public void addObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void moveWagon(String location) {
        if (round.getActionType() != null && round.getActionType().equals("Movimentar wagon")) {

            if (isPreviousLocation) {
                previousLocation = location;
                isPreviousLocation = false;
            } else {
                wishedLocation = location;

                Wagon wagon = null;
                for (Wagon w : wagons) {
                    if (w.getLocation().equals(previousLocation)) {
                        wagon = w;
                        break;
                    }
                }

                if (wagon == null) {
                    notificaAcaoFalhou("Vagão não encontrado no botão informado (" + previousLocation + ").");
                    return;
                }

                if (!isValidMoviment(wagon, wishedLocation)) {
                    notificaAcaoFalhou("Movimentação impossível, tente novamente.");
                    return;
                }

                try {
                    round.addMove(wagon, wishedLocation);
                } catch (Exception ex) {
                    notificaAcaoFalhou("Você já fez a quantidade máxima de movimentos para esta jogada!");
                    return;
                }

                wagon.setLocation(wishedLocation);

                notificaMovimentacaoConcluida(previousLocation, wagon.getLocation());

                previousLocation = null;
                wishedLocation = null;
                isPreviousLocation = true;
            }
        } else {
            notificaAcaoFalhou("Ação diferente de Movimentar wagon");
        }
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

    private boolean isValidMoviment(Wagon wagon, String wishedLocation) {
        return true;
    }

    private void notificaMovimentacaoConcluida(String previousWagonLocation, String wagonLocation) {
        String stateMessage = "Movimentação de vagão concluída com sucesso!";
        observers.forEach((o) -> {
            o.notificaMovimentacaoConcluida(previousWagonLocation, wagonLocation, stateMessage);
        });
    }

    private void notificaAcaoFalhou(String stateText) {
        observers.forEach((o) -> {
            o.notificaAcaoFalhou(stateText);
        });
    }

    private void notificaPlayersCriados() {
        observers.forEach((o) -> {
            o.notificaPlayersCriados();
        });
    }

    private void notificaTipoDeAcaoDefinido(String actionDefinedMessage) {
        observers.forEach((o) -> {
            o.notificaTipoDeAcaoDefinido(actionDefinedMessage);
        });
    }

    private void notificaRoundFinalizado(String endRoundMesssage) {
        observers.forEach((o) -> {
            o.notificaRoundFinalizado(endRoundMesssage);
        });
    }
}
