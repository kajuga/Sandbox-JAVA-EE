package javaPro;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

//@WebServlet(urlPatterns = "/MyServlet", description = "Мое описание сервлета")
public class MyServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

  //        request.setCharacterEncoding("UTF-8");
//        String receivedFirst = request.getParameter("firstname");
//        String receivedLast = request.getParameter("lastname");
//
//
//        response.setContentType("text/html");
//////        response.setContentType("text/html", charset=utf-8");  //или так
//        response.setCharacterEncoding("UTF-8");
//        PrintWriter out = response.getWriter();
//        out.println("<h1 style=\"color:darkblue;\">hello</h1>");
//        out.println("<h1 style=\"color:red;\">По-русски - привет! " + receivedFirst + " "  + receivedLast + "</h1>");
//        out.close();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String receivedFirst = request.getParameter("firstname");
        String receivedLast = request.getParameter("lastname");
//        String receivedJob = request.getParameter("job");
        String[] receivedJobs = request.getParameterValues("job");
        String receivedGender = request.getParameter("gender");
        if (receivedGender == null) {
            receivedGender = "-";
        }
        String receivedAge = request.getParameter("age18");


        response.setContentType("text/html");
//        response.setContentType("text/html", charset=utf-8");  //или так
        response.setCharacterEncoding("UTF-8");
        PrintWriter out = response.getWriter();

        out.println("Name: " + receivedFirst + "<br>");
        out.println("Lastname: " + receivedLast + "<br>");
        out.println("Gender: " + receivedGender + "<br>");
        out.println("Jobs: " + Arrays.deepToString(receivedJobs) + "<br>");
        out.println("Age: " + receivedAge + "<br>");
        out.close();

    }
}
