package Model;

public class Player {

    private String name;
    private String score;
    private String coins;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public String getCoins() {
        return coins;
    }

    public void setCoins(String coins) {
        this.coins = coins;
    }
}
