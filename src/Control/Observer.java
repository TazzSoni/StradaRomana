package Control;

import Model.Cube;
import Model.Ware;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

public interface Observer {

    void notificaWaresTilesCriados(ArrayList<Integer> numeros);

    void notificaWaresTilesPego(String wagonTileName, String wagonTileMessage, int posicao, int player);

    void notifyRandomizedWagonsE(ArrayList<Integer> numeros);

    void notifyRandomizedWagonsD(ArrayList<Integer> numeros);

    void notificaMovimentacaoConcluida(String wagonName, String wagonLocation, String stateText);

    void notificaPlayersCriados();

    void notificaAcaoFalhou(String stateText);

    void notificaTipoDeAcaoDefinido(String actionDefinedMessage);

    public void notificaRoundFinalizado(String endRoundMesssage);

    public void notificaCubePego(String cubeMessage);

    public void notificaWarePego(String wareMessage);

    public void notificaPrimeirosCubosAdicionados(List<Color> colors);

    public void notificaPrimeirosWaresAdicionados(List<Color> colors);

    public void notificaNovoCuboAtualizado(Color color, String cubeLocation);

    public void notificaNovoWareAtualizado(Color color, String wareLocation);

    public void notificarTipoMovimentacaoDefinido();

    public void endGame(String nome, int placar);

}
