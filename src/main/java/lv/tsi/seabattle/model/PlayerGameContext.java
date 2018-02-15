package lv.tsi.seabattle.model;

import org.apache.log4j.Logger;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import java.io.Serializable;

@SessionScoped
@Named
public class PlayerGameContext implements Serializable {
    private Player player;
    private Game game;
    private static final Logger logger = Logger.getLogger(PlayerGameContext.class);
    @PostConstruct
    private void created(){

    }
    @PreDestroy
    private void destroyed() {
       logger.info("Session canceled");
        game.setCancelled(true);
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public Game getGame() {
        return game;
    }


    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }



}
