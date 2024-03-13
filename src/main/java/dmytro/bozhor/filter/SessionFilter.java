package dmytro.bozhor.filter;

import dmytro.bozhor.registration.Person;
import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebFilter(urlPatterns = {
        "/cookie",
        "/session",
        "/redirection"
})
public class SessionFilter implements Filter {
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        var httpRequest = (HttpServletRequest) request;
        var httpResponse = (HttpServletResponse) response;

        var session = httpRequest.getSession();
        var user = (Person) session.getAttribute("user");

        if (user == null) {
            httpResponse.sendRedirect("/registration");
        }

        chain.doFilter(request, response);
    }
}
