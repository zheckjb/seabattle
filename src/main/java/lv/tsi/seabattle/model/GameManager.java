package lv.tsi.seabattle.model;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class GameManager {
    private Game incomplete;

    public Game register(Player player) {
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
