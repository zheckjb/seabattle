package lv.tsi.seabattle;

import lv.tsi.seabattle.model.Player;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "register", urlPatterns = "/register")
public class register extends HttpServlet {
//POST request - parameters passed within data container(?)
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("player1-name");
        System.out.println("POST: Input text: "+name);
        Player player = new Player();
        player.setName(name);
        response.sendRedirect("waitEnemyRegister");
    }
//GET request - parameter passed within url address
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //String name = request.getParameter("player1-name");
        System.out.println("GET (register)");
        request.getRequestDispatcher("/WEB-INF/register.jsp").include(request,response);
    }
}
