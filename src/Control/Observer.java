package Control;

import Model.Cube;
import Model.Ware;
import java.util.ArrayList;
import java.util.List;

public interface Observer {

    void notifyRandomizedWagonsE(ArrayList<Integer> numeros);

    void notifyRandomizedWagonsD(ArrayList<Integer> numeros);

    void notificaMovimentacaoConcluida(String wagonName, String wagonLocation, String stateText);

    void notificaPlayersCriados();

    void notificaAcaoFalhou(String stateText);

    void notificaTipoDeAcaoDefinido(String actionDefinedMessage);

    public void notificaRoundFinalizado(String endRoundMesssage);

    public void notificaCubePego(String cubeMessage);

    public void notificaWarePego(String wareMessage);

    public void notificaPrimeirosCubosAdicionados(List<String> colors);

    public void notificaPrimeirosWaresAdicionados(List<String> colors);

}
