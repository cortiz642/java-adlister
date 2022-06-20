import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletResponseWrapper;
import java.io.IOException;

@WebServlet(name = "viewColor", urlPatterns = "/viewcolor")
public class viewColor extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        request.getRequestDispatcher("color").forward(request, response);
        String color = request.getParameter("color");
        request.setAttribute("color", color);
        request.getRequestDispatcher("viewColor.jsp").forward(request, response);
    }
}
//    @Override
//    protected void doGET(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        response.sendRedirect("viewColor.jsp");
//    }
//    @Override
//    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        response.sendRedirect("color, pickColorServlet");
//
//}

//    @Override
//    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        request.getRequestDispatcher("viewColor.jsp").forward(request, response);
//    }
//
//    }
//
//    private void processRequest(HttpServletRequest request, HttpServletResponse response) {
//    }

