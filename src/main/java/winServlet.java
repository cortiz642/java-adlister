import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet("/correct")
public class winServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        String win = request.getParameter("win");
        String win = ("two");
        request.setAttribute("win", win);
        response.getWriter().println("You should see this in the browser");

        request.getRequestDispatcher("guessOutcome.jsp").forward(request, response);
//        if(win == "one"){
//            System.out.println("you win!");
//        }
    }
}
