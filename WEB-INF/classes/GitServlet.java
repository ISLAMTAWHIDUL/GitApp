import java.io.IOException;
import javax.servlet.*;
import javax.servlet.http.*;

public class GitServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html; charset=UTF-8");

        String msg = request.getParameter("msg");

        response.getWriter().println("<html><body>");
        response.getWriter().println("<h2>Received Message:</h2>");
        response.getWriter().println("<p>" + msg + "</p>");
        response.getWriter().println("</body></html>");
    }
}