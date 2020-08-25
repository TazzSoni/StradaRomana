/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import AbstractFactory.ActionFactory;
import AbstractFactory.ActionType;
import AbstractFactory.MovimentarWagonFactory;
import AbstractFactory.PassarVezFactory;
import AbstractFactory.PegarWagonTileFactory;
import Model.Bag;
import Model.Cube;
import Model.Player;
import Model.Wagon;
import Model.Ware;
import java.awt.Color;
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
    private List<Cube> cubes = new ArrayList<>();
    private List<Ware> wares = new ArrayList<>();
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
        getFirstCubesFromBag();
        getFirstWaresFromBag();

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
    private ActionType montarAcao(String tipo){
        ActionFactory af = null;
        switch (tipo){
            case "Movimentar wagon":
                af = new MovimentarWagonFactory();
                break;
            case "Pegar wagon tile":
                af = new PegarWagonTileFactory();
                break;
            case "Passar a vez":
                af = new PassarVezFactory();
                break;
            default:
                notificaAcaoFalhou("Selecione o tipo de ação");
                break;
        }
        ActionType acao = new ActionType();
        acao.setAcao(af.definirAcao());
        return acao;
    }

    private void getFirstCubesFromBag() {
        for (int i = 0; i < 14; i++) {
            Cube cube = bag.takeCube();
            cubes.add(cube);
        }

        notificaPrimeirosCubosAdicionados();
    }

    private void getFirstWaresFromBag() {
        for (int i = 0; i < 6; i++) {
            Ware ware = bag.takeWare();
            wares.add(ware);
        }

        notificaPrimeirosWaresAdicionados();
    }

    @Override
    public void addObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void moveWagon(String location) {
        if (round.getActionType() != null && round.getActionType().getAcao().equals("Movimentar wagon")) {
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
        if ((round.getActionType() == null) && !(actionType.equals("Selecione"))) {
            if (actionType.equals("Passar a vez")) {
                round.getPlayer().addCoins(1);
            }
            round.setActionType(montarAcao(actionType));
            notificaTipoDeAcaoDefinido(actionType + " definida com sucesso. Você não poderá escolher outra ação até seu próximo round!");
        } else if (actionType.equals("Selecione")){
            notificaAcaoFalhou("Selecione uma opção");
        }else{
            notificaTipoDeAcaoDefinido("Ação já definida para este turno, " + round.getActionType().getAcao() + " é sua ação para este turno");
        }
    }

    @Override
    public void endRoundCommand() {
        if (!(round.getActionType() == null)) {
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
        if (isPreviousLocation && cubeLocation.contains("cube")) {
            Wagon wagon = round.getLastWagonMoved();
            if (wagon != null && wagon.getLocation().equals(cubeLocation.substring(4, 7))) {
                Cube cube = getCubeByLocation(cubeLocation);
                cubes.remove(cube);
                round.getPlayer().addCube(cube);
                round.checkNewContract(cube.getColor());
                notificaCubePego("Cubo resgatado com sucesso!!");
                cube = bag.takeCube();
                cubes.add(cube);
                notificaNovoCuboAtualizado(cube, cubeLocation);
            } else {
                notificaAcaoFalhou("Tentativa de pegar cubo inválida");
            }
        } else {
            notificaAcaoFalhou("Tentativa de pegar cubo inválida");
        }
    }

    private Cube getCubeByLocation(String cubeLocation) {
        for (Cube c : cubes) {
            if (c.getLocation().equals(cubeLocation)) {
                return c;
            }
        }
        //System.out.println("Nenhum cubo encontrado na posição enviada (" + cubeLocation + ").");
        return null;
    }

    @Override
    public void takeWare(String wareLocation) {
        if (round.getLastWagonMoved() != null && wareLocation.contains("ware")) {
            Wagon wagon = round.getLastWagonMoved();
            if ((wagon.getLocation().substring(0, 1).equals(wareLocation.substring(4, 5)))
                    && (wagon.getLocation().substring(2).equals(wareLocation.substring(5)))) {
                Ware ware = getWareByLocation(wareLocation);
                wares.remove(ware);
                round.getPlayer().addWare(ware);
                round.checkNewContract(ware.getColor());
                notificaWarePego("Azulejo resgatado com sucesso!!");
                ware = bag.takeWare();
                wares.add(ware);
                notificaNovoWareAtualizado(ware, wareLocation);
            } else {
                notificaAcaoFalhou("Posição de vagão inválida para pegar azulejo");
            }
        } else {
            notificaAcaoFalhou("Tentativa de pegar azulejo inválida");
        }
    }

    private Ware getWareByLocation(String wareLocation) {
        for (Ware w : wares) {
            if (w.getLocation().equals(wareLocation)) {
                return w;
            }
        }
        //System.out.println("Nenhuma ware encontrada na posição enviada (" + wareLocation + ").");
        return null;
    }

    /**
     * Ao enviar a localização do cubo neste método, envie a localização da
     * mesma forma que for enviar quando chama o método takeCube. Ou seja, se
     * você enviar a palavra "cube" lá, envie aqui também. Além disso, existe
     * uma lista de cores pré-definidas para cubos e wares. Envie as cores da
     * forma como existem nessa lista, que fica na classe Bag. Note que se o
     * esquema de cores for diferente no front e no back, vc pode atualizar o
     * nome das cores na classe Bag para que usemos a mesma nomenclatura.
     *
     * @param cubeLocation Localização do cubo
     * @param cubeColor Cor do cubo
     */
    @Override
    public void setCubeLocation(String cubeLocation, Color cubeColor) {
        for (Cube c : cubes) {
            if ((c.getColor() == cubeColor) && c.getLocation() == null) {
                c.setLocation(cubeLocation);
                break;
            }
        }
    }

    /**
     * Ao enviar a localização do ware neste método, envie a localização da
     * mesma forma que for enviar quando chama o método takeWare. Ou seja, se
     * você enviar a palavra "ware" lá, envie aqui também. Além disso, existe
     * uma lista de cores pré-definidas para cubos e wares. Envie as cores da
     * forma como existem nessa lista, que fica na classe Bag. Note que se o
     * esquema de cores for diferente no front e no back, vc pode atualizar o
     * nome das cores na classe Bag para que usemos a mesma nomenclatura.
     *
     * @param wareLocation Localização da ware
     * @param wareColor Cor da ware
     */
    @Override
    public void setWareLocation(String wareLocation, Color wareColor) {
        for (Ware w : wares) {
            if ((w.getColor() == wareColor) && w.getLocation() == null) {
                w.setLocation(wareLocation);
                break;
            }
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

    /**
     * O método abaixo envia ao front a lista de cores que os primeiros cubos
     * deverão ter. Ao receber as cores, para cada botão de cubo que você
     * pintar, chame o método "setCubeLocation", enviando a localização do cubo
     * e sua cor.
     */
    private void notificaPrimeirosCubosAdicionados() {
        List<Color> colors = new ArrayList<>();

        cubes.forEach((c) -> {
            colors.add(c.getColor());
        });

        observers.forEach((o) -> {
            o.notificaPrimeirosCubosAdicionados(colors);
        });
    }

    /**
     * O método abaixo envia ao front a lista de cores que os primeiros wares
     * deverão ter. Ao receber as cores, para cada botão de ware que você
     * pintar, chame o método "setWareLocation", enviando a localização da ware
     * e sua cor.
     */
    private void notificaPrimeirosWaresAdicionados() {
        List<Color> colors = new ArrayList<>();

        wares.forEach((w) -> {
            colors.add(w.getColor());
        });

        observers.forEach((o) -> {
            o.notificaPrimeirosWaresAdicionados(colors);
        });
    }

    /**
     * Após um cubo ser pego, o botão onde esse cubo estava deve ser atualizado.
     * Este método de notificação é o responsável por enviar a cor do novo cubo
     * que será colocado no botão substituindo o outro.
     *
     * @param cube Novo cubo retirado da bag contendo a cor atualizada do botão.
     */
    private void notificaNovoCuboAtualizado(Cube cube, String cubeLocation) {
        observers.forEach((o) -> {
            o.notificaNovoCuboAtualizado(cube.getColor(), cubeLocation);
        });
    }

    /**
     * Após um ware ser pego, o botão onde esse ware estava deve ser atualizado.
     * Este método de notificação é o responsável por enviar a cor do novo ware
     * que será colocado no botão substituindo o outro.
     *
     * @param ware Novo ware retirado da bag contendo a cor atualizada do botão.
     */
    private void notificaNovoWareAtualizado(Ware ware, String wareLocation) {
        observers.forEach((o) -> {
            o.notificaNovoWareAtualizado(ware.getColor(), wareLocation);
        });
    }
}
