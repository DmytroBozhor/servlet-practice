package dmytro.bozhor;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/redirect")
public class RedirectionServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        var requestDispatcher = getServletContext().getRequestDispatcher("/cookie");
//        requestDispatcher.forward(req, resp);

//        var requestDispatcher = req.getRequestDispatcher("/cookie");
//        requestDispatcher.include(req, resp);

        resp.sendRedirect("/cookie");

    }
}
