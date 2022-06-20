import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(name = "pickColorServlet", urlPatterns = "/pickcolor")
    public class pickColorServlet extends HttpServlet{

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("pickcolor.jsp").forward(request, response);
//        response.sendRedirect("viewColor.jsp");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        response.sendRedirect("color, pickColorServlet");
        String color = request.getParameter("color");
        response.sendRedirect("/viewcolor?color=" + color);
    }
//        String name = request.getParameter("color");
//        response.sendRedirect("viewColor");
//        @Override
//        protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//            processRequest(request, response);
//        String userInput = request.getParameter("input");
//        String submit = request.getParameter("Submit");
////
//    }
//
//    private void processRequest(HttpServletRequest request, HttpServletResponse response) {
//    }

}
