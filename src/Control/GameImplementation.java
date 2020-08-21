/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Model.Bag;
import Model.Cube;
import Model.Player;
import Model.Wagon;
import Model.Ware;
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
    private Bag bag = Bag.getInstance();

    String previousLocation;
    String wishedLocation;
    private boolean isPreviousLocation = true;

    private ArrayList<String> movimentacoes = new ArrayList<>();

    private void criaMapaDeMovimentacaoEpD() {
        movimentacoes.add("111-121,***");
        movimentacoes.add("113-121,122");
        movimentacoes.add("112-122,***");
        movimentacoes.add("121-131,132");
        movimentacoes.add("122-132,***");
        movimentacoes.add("131-141,***");
        movimentacoes.add("132-141,142");
        movimentacoes.add("141-151,***");
        movimentacoes.add("142-152,***");
        movimentacoes.add("151-211,***");
        movimentacoes.add("152-211,212");
        movimentacoes.add("211-221,222");
        movimentacoes.add("212-222,***");
        movimentacoes.add("221-231,***");
        movimentacoes.add("222-232,***");
        movimentacoes.add("231-241,***");
        movimentacoes.add("232-241,***");
        movimentacoes.add("241-251,252");
        movimentacoes.add("251-311,313");
        movimentacoes.add("252-313,312");
        movimentacoes.add("311-321,***");
        movimentacoes.add("313-321,322");
        movimentacoes.add("312-322,***");
        movimentacoes.add("321-331,***");
        movimentacoes.add("322-332,***");
        movimentacoes.add("331-341,342");
        movimentacoes.add("332-342,***");
        movimentacoes.add("341-351,***");
        movimentacoes.add("342-351,352");
    }

    private void criaMapaDeMovimentacaoDpE() {
        movimentacoes.add("351-341,342");
        movimentacoes.add("352-342,***");
        movimentacoes.add("341-331,***");
        movimentacoes.add("342-331,332");
        movimentacoes.add("331-321,***");
        movimentacoes.add("332-322,***");
        movimentacoes.add("321-311,313");
        movimentacoes.add("322-313,312");
        movimentacoes.add("311-251,***");
        movimentacoes.add("313-251,252");
        movimentacoes.add("312-252,***");
        movimentacoes.add("251-241,***");
        movimentacoes.add("252-241,***");
        movimentacoes.add("241-231,232");
        movimentacoes.add("231-221,***");
        movimentacoes.add("232-222,***");
        movimentacoes.add("221-211,***");
        movimentacoes.add("222-211,212");
        movimentacoes.add("211-151,152");
        movimentacoes.add("212-152,***");
        movimentacoes.add("151-141,***");
        movimentacoes.add("152-142,***");
        movimentacoes.add("141-131,132");
        movimentacoes.add("142-132,***");
        movimentacoes.add("131-121,***");
        movimentacoes.add("132-121,122");
        movimentacoes.add("121-111,113");
        movimentacoes.add("122-113,112");

    }

    @Override
    public Player getPlayer1() {
        return player1;
    }

    @Override
    public Player getPlayer2() {
        return player2;
    }

    @Override
    public void prepareGameSetup(String player1Name, String player2Name) {
        player1 = new Player(player1Name);
        player2 = new Player(player2Name);
        randomPlayerToBegin();

        String[] wagonNames = new String[]{"Ballio", "Demetrius", "Herennius", "Maccus", "Hamilcar", "Canopites", "Curculio", "Persa", "Plotus", "Pseudolus"};
        createWagons(wagonNames);
        createWagonTiles(wagonNames);

        notificaPlayersCriados();
    }

    private void randomPlayerToBegin() {
        int randomNum = 0;
        while (randomNum == 0) {
            randomNum = random.nextInt(3);
        }

        if (randomNum == 1) {
            round.setPlayer(player1);
            player2.addCoins(1);
        } else {
            round.setPlayer(player2);
            player1.addCoins(1);
        }
    }

    private void createWagons(String[] wagonNames) {
        for (int i = 0; i < 10; i++) {
            Wagon wagon;
            if (i < 5) {
                wagon = new Wagon(wagonNames[i], "D");
            } else {
                wagon = new Wagon(wagonNames[i], "E");
            }
            wagon.setLocation(Integer.toString(i + 1));
            wagons.add(wagon);
        }
    }

    private void createWagonTiles(String[] wagonNames) {
        bag.createWagonTiles(wagonNames);
    }

    @Override
    public void getRandomizedWagons(String boardSide) {
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
        if (round.getActionType() != null && round.getActionType().equals(TiposAcoes.MOVIMENTAR_WAGON.getDescricao())) {
            if (isPreviousLocation) {
                previousLocation = location;
                isPreviousLocation = false;
            } else {
                wishedLocation = location;

                Wagon wagon = getWagonByLocation(previousLocation);

                if (wagon == null) {
                    notificaAcaoFalhou("Vagão não encontrado no botão informado (" + previousLocation + ").");
                    resetMoveData();
                    return;
                }

                if (previousLocation.equals(wishedLocation)) {
                    notificaAcaoFalhou("Posição final deve ser diferente da inicial, clique novamente na posição final desejada");
                    return;
                }

                if ((location.contains("cube") || location.contains("ware"))) {
                    notificaAcaoFalhou("Movimentação impossível, tente novamente.");
                    resetMoveData();
                    return;
                }

                if (!isValidMoviment(wagon, previousLocation, wishedLocation)) {
                    notificaAcaoFalhou("Movimentação impossível, tente novamente.");
                    resetMoveData();
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
                resetMoveData();
            }
        } else {
            notificaAcaoFalhou("Tentativa de jogada inválida");
        }
    }

    private void resetMoveData() {
        previousLocation = null;
        wishedLocation = null;
        isPreviousLocation = true;
    }

    private Wagon getWagonByLocation(String location) {
        for (Wagon w : wagons) {
            if (w.getLocation().equals(location)) {
                return w;
            }
        }
        return null;
    }

    @Override
    public void setActionTypeCommand(String actionType) {
        if (round.getActionType().equals("")) {
            if (actionType.equals(TiposAcoes.PASSAR_VEZ.getDescricao())) {
                round.getPlayer().addCoins(1);
            }
            round.setActionType(actionType);
            notificaTipoDeAcaoDefinido(actionType + " definida com sucesso. Você não poderá escolher outra ação até seu próximo round!");
        } else {
            notificaTipoDeAcaoDefinido("Ação já definida para este turno, " + round.getActionType() + " é sua ação para este turno");
        }
    }

    @Override
    public void endRoundCommand() {
        if (round.getActionType() != "") {
            Player nextPlayer = round.endRound(player1, player2);
            notificaRoundFinalizado("Round finalizado! O próximo turno é de " + nextPlayer.getName());
        } else {
            notificaAcaoFalhou("Execute sua ação para poder encerrar o turno");
        }
    }

    private boolean isValidMoviment(Wagon wagon, String previusLocation, String wishedLocation) {
        boolean resposta = false;
        if (Integer.parseInt(previusLocation) < Integer.parseInt(wishedLocation)) {
            criaMapaDeMovimentacaoEpD();
            for (String m : movimentacoes) {
                String partida = m.substring(0, 3);
                String destino1 = m.substring(4, 7);
                String destino2 = m.substring(8, 11);
                if (partida.equals(previusLocation) && (Integer.parseInt(previusLocation) > 10)) {
                    if ((wishedLocation.equals(destino1) || (wishedLocation.equals(destino2)))) {
                        resposta = true;
                    } else {
                        resposta = false;
                    }
                } else if (Integer.parseInt(previusLocation) < 10) {
                    if (wishedLocation.equals("111") || wishedLocation.equals("112") || wishedLocation.equals("113")) {
                        resposta = true;
                    } else {
                        resposta = false;
                    }
                }
            };
            movimentacoes.clear();
        } else {
            criaMapaDeMovimentacaoDpE();
            for (String m : movimentacoes) {
                String partida = m.substring(0, 3);
                String destino1 = m.substring(4, 7);
                String destino2 = m.substring(8, 11);
                if (partida.equals(previusLocation) && (Integer.parseInt(previusLocation) > 10)) {
                    if ((wishedLocation.equals(destino1) || (wishedLocation.equals(destino2)))) {
                        resposta = true;
                    } else {
                        resposta = false;
                    }
                } else if (Integer.parseInt(previusLocation) < 10) {
                    if (wishedLocation.equals("351") || wishedLocation.equals("352")) {
                        resposta = true;
                    } else {
                        resposta = false;
                    }
                }
            };
            movimentacoes.clear();
        }
        return resposta;
    }

    @Override
    public void takeCube(String cubeLocation) {
        Cube cube = new Cube(cubeLocation);

        if (isPreviousLocation && cubeLocation.contains("cube")) {
            cubeLocation = cubeLocation.substring(4, 7);
            Wagon wagon = getWagonByLocation(cubeLocation);
            if (wagon != null && wagon.getLocation().equals(cubeLocation)) {
                round.getPlayer().addCube(cube);
                notificaCubePego("Cubo resgatado com sucesso!!");
            } else {
                notificaAcaoFalhou("Posição de vagão inválida para pegar cubo");
            }
        } else {
            notificaAcaoFalhou("Tentativa de pegar cubo inválida");
        }
    }

    @Override
    public void takeWare(String wareLocation) {
        Ware ware = new Ware(wareLocation);
        if (round.getLastWagonMoved() != null && wareLocation.contains("ware")) {
            if ((round.getLastWagonMoved().getLocation().substring(0, 1).equals(wareLocation.substring(4, 5)))
                    && (round.getLastWagonMoved().getLocation().substring(2).equals(wareLocation.substring(5)))) {
                round.getPlayer().addWare(ware);
                notificaWarePego("Azulejo resgatado com sucesso!!");
            } else {
                notificaAcaoFalhou("Posição de vagão inválida para pegar azulejo");
            }
        } else {
            notificaAcaoFalhou("Tentativa de pegar azulejo inválida");
        }
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

    private void notificaCubePego(String cubeMessage) {
        observers.forEach((o) -> {
            o.notificaCubePego(cubeMessage);
        });
    }

    private void notificaWarePego(String wareMessage) {
        observers.forEach((o) -> {
            o.notificaWarePego(wareMessage);
        });
    }

    @Override
    public String getRoundPlayer() {
        return round.getPlayer().getName();
    }
}
