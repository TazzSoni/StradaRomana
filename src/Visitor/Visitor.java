package Visitor;

import Model.Player;
import Model.Score;

/**
 *
 * @author Rodrigo
 */
public interface Visitor {

    void visit(Score score,  Player player) throws Exception;

}
