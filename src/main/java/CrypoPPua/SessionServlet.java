package CrypoPPua;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/SessionServlet")
public class SessionServlet extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException {
        performTask(req, resp);
    }

    private void performTask(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException {
        SessionLogic.printToBrowser(resp, req);
    }
}