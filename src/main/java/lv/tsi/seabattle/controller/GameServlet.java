package lv.tsi.seabattle.controller;

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

@WebServlet(name = "GameServlet", urlPatterns = "/game")
public class GameServlet extends HttpServlet {
    @Inject
    private PlayerGameContext playerGameContext;
    private static final Logger logger = Logger.getLogger(GameServlet.class);

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String addr = request.getParameter("addr");
        logger.info(addr);
        playerGameContext.getGame().fire(addr);
        if (playerGameContext.getGame().isFinished()) {
            response.sendRedirect("result");
        } else {
            response.sendRedirect("game");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Player me = playerGameContext.getPlayer();
        Player current = playerGameContext.getGame().getCurrentPlayer();
        if (playerGameContext.getGame().isFinished()) {
            response.sendRedirect("result");
        } else if (me == current) {
            request.getRequestDispatcher("/WEB-INF/fire.jsp").include(request,response);
        } else {
            request.getRequestDispatcher("/WEB-INF/waitEnemyFire.jsp").include(request,response);
        }

    }
}
