package Model.WagonTile;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

/**
 *
 * @author guilh
 */
public class WagonTile  implements Item{
    
  
    private ArrayList<Item> wagonTiles = new ArrayList<>();

    public WagonTile() {
    }
    
    public void addItem(Item wagon){
        wagonTiles.add(wagon);
    }
    
    public void removeItem(int index){
        wagonTiles.remove(index);
    }
    
    @Override
    public void shuffle() {
        Collections.shuffle(wagonTiles);
        wagonTiles.remove(0);
    }
    
}
