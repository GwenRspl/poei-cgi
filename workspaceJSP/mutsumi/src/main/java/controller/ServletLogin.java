package controller;

import dao.DAOClientJdbc;
import model.Client;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet(name = "ServletLogin")
public class ServletLogin extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("login-result.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        String mdp = request.getParameter("password");
        Client c = null;
        try {
            c = authenticate(id, mdp);
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        if (c != null) {
            request.getSession().setAttribute("client", c);
        }
        doGet(request, response);
    }

    private Client authenticate(int id, String mdp) throws SQLException, ClassNotFoundException {
        Client c = new DAOClientJdbc().findById(id);
        if (c != null && !c.getPassword().equals(mdp)) {
            return null;
        }
        return c;
    }
}
