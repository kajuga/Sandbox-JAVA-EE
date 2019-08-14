package Metanit;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/PersonServlet")
public class PersonServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)   throws ServletException, IOException {

        HttpSession session = request.getSession();
//        session.setMaxInactiveInterval(5);
        Person tom = (Person) session.getAttribute("person");

        PrintWriter out = response.getWriter();
        try {
            if(tom == null) {

                tom = new Person("Tom", 34);
                session.setAttribute("person", tom);
                out.println("Session data are set");
            }
            else {
                out.println("Name: " + tom.getName() + " Age: " + tom.getAge());
                session.removeAttribute("person");
            }
        }
        finally {
            out.close();
        }
    }
}