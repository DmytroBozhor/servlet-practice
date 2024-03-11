package dmytro.bozhor.registration;

public final class JspUtil {
    private static final JspUtil jspUtil = new JspUtil();
    private static final String PATH = "/WEB-INF/jsp/%s.jsp";

    private JspUtil() {
    }

    public static JspUtil getInstance() {
        return jspUtil;
    }

    public String getPathByName(String jspFileName) {
        return String.format(PATH, jspFileName);
    }
}
