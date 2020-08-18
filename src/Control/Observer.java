package Control;

import java.util.ArrayList;

public interface Observer {

    void notifyRandomizedWagons(ArrayList<Integer> numeros);

    void notificaMovimentacaoConcluida(String wagonName, String wagonLocation, String stateText);

    void notificaPlayersCriados();

    void notificaAcaoFalhou(String stateText);

    void notificaTipoDeAcaoDefinido(String actionDefinedMessage);

    public void notificaRoundFinalizado(String endRoundMesssage);
    
}
