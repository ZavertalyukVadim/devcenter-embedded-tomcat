package servlet;

import print.Print;
import print.PrintInWeb;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Вадимка on 13.11.2016.
 */
@WebServlet(
        name = "CalendarServlet",
        urlPatterns = {"/calendar"})

public class CalendarServlet extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<DayOfWeek> dayOfWeeks = new ArrayList<>();
        PrintWriter out = resp.getWriter();
        Print print;
        if(req.getParameter("month").length()>0) {
        try{
                        print= new PrintInWeb();
                        String weekend = req.getParameter("weekends");
                        List<DayOfWeek> weekList = add(weekend, dayOfWeeks);
                        print.setToday(LocalDate.of(Integer.parseInt(req.getParameter("year")), Integer.parseInt(req.getParameter("month")), Integer.parseInt(req.getParameter("day"))));
                        print.setDayOfWeek(DayOfWeek.of(Integer.parseInt(req.getParameter("dayOfWeek"))));
                        print.setWeekends(weekList);
                        out.append(print.print());
                        out.append(form);
                        out.flush();
                        out.close();

            }
            catch (Exception e){
                e.printStackTrace();
                print =  new PrintInWeb();
                out.append(print.print());
                out.append(form);
                out.flush();
                out.close();
            }
        }
        else {
            print= new PrintInWeb();
            out.append(print.print());
            out.append(form);
            out.flush();
            out.close();

        }

    }

    private static List<DayOfWeek> add(String s, List<DayOfWeek> dayOfWeeks) {
        String[] numbersArray = s.split("[ ,]");
        for (String number : numbersArray) {
            if (!number.trim().isEmpty()) {
                DayOfWeek weekends = DayOfWeek.of(Integer.parseInt(number.trim()));
                dayOfWeeks.add(weekends);
            }
        }
        return dayOfWeeks;
    }
    static String form =
            "<form method=\"LINK\" action=\"http://localhost:8080\">\n" +
                    "    <input type=\"submit\" value=\"Home\">\n" +
                    "</form>" ;
}
