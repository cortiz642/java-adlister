import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(name = "guessServlet", urlPatterns = "/guess")
public class guessServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("guess.jsp").forward(request, response);
    }


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
    String win = request.getParameter("win");
//    String lose = request.getParameter("loseNumber");
        boolean guessAttempt = false;
//        int winAttempt = 2;
        if(guessAttempt) {
            response.sendRedirect("/incorrect?lose=" + win);
            response.getWriter().println("You should see this in the browser");
        }else{
            response.sendRedirect("/correct?win=" + win);
            response.getWriter().println("should see this in the browser");
        }
        }
    }

