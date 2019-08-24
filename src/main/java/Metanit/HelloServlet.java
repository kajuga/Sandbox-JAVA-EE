package Metanit;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/hello")
public class HelloServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String id = request.getParameter("id");
        if(id == null) {

            String path = request.getContextPath() + "/notfound";
            response.sendRedirect(path);
        }

        else if (id == "666"){
            String path = request.getContextPath() + "https://metanit.com/";
            response.sendRedirect(path);
        }

//        else {
//            response.setContentType("text/html");
//            PrintWriter writer = response.getWriter();
//            try {
//                writer.println("<h2>Hello Id " + id + "</h2>");
//            } finally {
//                writer.close();
//            }
//        }
    }
}

