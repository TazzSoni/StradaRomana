package Model;

public class Wagon {

    /**
     * A localização sempre será um conjunto de 3 caracteres. O primeiro
     * caractere é referente ao quadrante do vagão (no maunal, partes A, B e C).
     * O segundo caractere é referente à coluna do vagão dentro daquele
     * quadrante. O terceiro caractere é referente à linha do vagão.
     */
    private String location;

    private String movesTo;
    
    private String name;

    public Wagon(String name, String movesTo) {
        this.name = name;
        this.movesTo = movesTo;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getMovesTo() {
        return movesTo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
