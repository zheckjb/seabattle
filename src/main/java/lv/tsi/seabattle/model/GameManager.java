package lv.tsi.seabattle.model;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class GameManager {
    private Game incomplete;
//iF method is not synchronised, implement variable might change statuses unexpectly, as other process will take care of it
// use synchronise to wait until method is executed for one process till end of code.
    public synchronized Game register(Player player) {
        if (incomplete == null) {
            //Create new game
            incomplete = new Game();
            //Add first Player
            incomplete.setPlayer1(player);
            return incomplete;
        } else {
            incomplete.setPlayer2(player);
            Game tmp = incomplete;
            incomplete = null;
            return tmp;
        }

    }
}
