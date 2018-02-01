package lv.tsi.seabattle.model;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import java.io.Serializable;

@SessionScoped
@Named
public class PlayerGameContext implements Serializable {
    private Player player;
    private static Game game;

    public static void setGame(Game game) {
        PlayerGameContext.game = game;
    }

    public static Game getGame() {
        return game;
    }


    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }



}
