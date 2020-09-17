package Model.WagonTile;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

/**
 *
 * @author guilh
 */
public class WagonTile implements Item {

    private ArrayList<Item> wagonTiles = new ArrayList<>();

    public WagonTile() {
    }

    public ArrayList<Item> getArray() {
        return wagonTiles;
    }

    public void addItem(Item wagon) {
        wagonTiles.add(wagon);
    }

    @Override
    public int size() {
        return wagonTiles.size();
    }

    public void shuffle() {
        Collections.shuffle(wagonTiles);
        wagonTiles.remove(0);
    }
    
    @Override
    public void removeItem(int index) {
        wagonTiles.remove(index);
    }

    @Override
    public Item getWagonTiles(int index) {
        return wagonTiles.get(index);
    }

}
