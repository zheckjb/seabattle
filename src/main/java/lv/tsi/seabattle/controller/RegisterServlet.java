package lv.tsi.seabattle.controller;

import lv.tsi.seabattle.model.Game;
import lv.tsi.seabattle.model.GameManager;
import lv.tsi.seabattle.model.Player;
import lv.tsi.seabattle.model.PlayerGameContext;
import org.apache.log4j.Logger;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(name = "RegisterServlet", urlPatterns = "/register")
public class RegisterServlet extends HttpServlet {
//POST request - parameters passed within data container(?)
    @Inject
    private PlayerGameContext playerGameContext;
    @Inject
    private GameManager gameManager;
    private static final Logger logger = Logger.getLogger(RegisterServlet.class);
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("player-name");
        logger.info(name);
        Player player = new Player();
        player.setName(name);
        playerGameContext.setPlayer(player);

        Game game = gameManager.register(player);

        playerGameContext.setGame(game);

        response.sendRedirect("waitEnemyRegister");
    }
//GET request - parameter passed within url address
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        logger.info("User session started");
        request.getRequestDispatcher("/WEB-INF/register.jsp").include(request,response);
    }
}
