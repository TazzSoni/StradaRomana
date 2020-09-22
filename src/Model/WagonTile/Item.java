/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.WagonTile;

/**
 *
 * @author Rodrigo
 */
public interface Item {
    Item getWagonTiles(int index);

    void removeItem(int index);

    int size();

    void add(Item wagonTiles);
}
