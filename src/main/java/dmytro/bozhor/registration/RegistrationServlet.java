package dmytro.bozhor.registration;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/registration")
public class RegistrationServlet extends HttpServlet {

    private final JspUtil jspUtil = JspUtil.getInstance();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher(jspUtil.getPathByName("registration")).forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        var person = new Person.Builder()
                .name(req.getParameter("name"))
                .email(req.getParameter("email"))
                .gender(req.getParameter("gender"))
                .build();
//        service.save(person);
        System.out.println(person);

//        getServletConfig().getServletContext().
    }
}
