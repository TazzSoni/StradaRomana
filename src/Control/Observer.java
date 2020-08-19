package Control;

import java.util.ArrayList;

public interface Observer {

    void notifyRandomizedWagonsE(ArrayList<Integer> numeros);

    void notifyRandomizedWagonsD(ArrayList<Integer> numeros);

    void notificaMovimentacaoConcluida(String wagonName, String wagonLocation, String stateText);

    void notificaPlayersCriados();

    void notificaAcaoFalhou(String stateText);

    void notificaTipoDeAcaoDefinido(String actionDefinedMessage);

    public void notificaRoundFinalizado(String endRoundMesssage);

    public void notificaCubePego(String cubeMessage);

    public void notificaFalhaPegarCubo(String cubeMessage);

}
