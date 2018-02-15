package lv.tsi.seabattle.controller;

import lv.tsi.seabattle.model.PlayerGameContext;
import org.apache.log4j.Logger;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ResultServlet", urlPatterns = "result")
public class ResultServlet extends HttpServlet {
    @Inject
    private PlayerGameContext playerGameContext;
    private static final Logger logger = Logger.getLogger(ResultServlet.class);
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        if (playerGameContext.getPlayer().isWinner()) {
            request.getRequestDispatcher("/WEB-INF/winner.jsp").include(request,response);
        } else {
            request.getRequestDispatcher("/WEB-INF/looser.jsp").include(request,response);
        }
    }
}
