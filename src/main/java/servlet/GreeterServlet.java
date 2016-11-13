package servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(
        name = "GreeterServlet",
        urlPatterns = {"/hello_world"}
)
public class GreeterServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        String name;
        if(req.getParameter("name").length()==0){
            name = "world!";
        }else{
            name=req.getParameter("name");
        }
        out.append(header);
        out.append("hello ").append(name);
        out.append(form);
        out.append(footer);
        out.flush();
        out.close();
    }
    static String form =
            "<form method=\"LINK\" action=\"http://localhost:8080\">\n" +
                    "    <input type=\"submit\" value=\"Home\">\n" +
                    "</form>" ;
    static String header = "<!DOCTYPE html>\n" +
            "<html>\n" +
            "<head>\n" +
            "<title>Page Title</title>\n" +
            "</head>\n" +
            "<body>\n";


    static String footer =
            "</body>\n" +
                    "</html>";

}
