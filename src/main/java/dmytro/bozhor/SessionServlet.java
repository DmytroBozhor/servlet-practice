package dmytro.bozhor;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.Arrays;
import java.util.function.Predicate;

@WebServlet("/session")
public class SessionServlet extends HttpServlet {

    private static final String J_SESSION_ID = "JSESSIONID";

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        var session = req.getSession();

        if (!session.isNew()) {
            System.out.println(J_SESSION_ID + ": " + Arrays.stream(req.getCookies())
                    .filter(cookie -> J_SESSION_ID.equals(cookie.getName()))
                    .findFirst().orElseThrow(RuntimeException::new).getValue());
        }

    }
}
