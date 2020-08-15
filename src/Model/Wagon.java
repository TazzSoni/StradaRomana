package Model;

public class Wagon {

    private String name;
    
    /** A localização sempre será um conjunto de 3 caracteres.
    * O primeiro caractere é referente ao quadrante do vagão (no maunal, partes A, B e C).
    * O segundo caractere é referente à coluna do vagão dentro daquele quadrante.
    * O terceiro caractere é referente à linha do vagão.
    */ 
    private String location;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
    
}
