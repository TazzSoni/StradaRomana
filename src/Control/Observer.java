package Control;

import java.util.ArrayList;

public interface Observer {

    void notifyRandomizedWagons(ArrayList<Integer> numeros);

    void notificaMovimentacaoConcluida(String wagonName, String wagonLocation);

    void notificaPlayersCriados();
    
}
