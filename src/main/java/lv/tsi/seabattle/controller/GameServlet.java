package lv.tsi.seabattle.controller;

import lv.tsi.seabattle.model.Player;
import lv.tsi.seabattle.model.PlayerGameContext;

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

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String addr = request.getParameter("addr");
        playerGameContext.getGame().fire(addr);
        response.sendRedirect("game");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Player me = playerGameContext.getPlayer();
        Player current = playerGameContext.getGame().getCurrentPlayer();
        if (me == current) {
            request.getRequestDispatcher("/WEB-INF/fire.jsp").include(request,response);
        } else {
            request.getRequestDispatcher("/WEB-INF/waitEnemyFire.jsp").include(request,response);
        }

    }
}
