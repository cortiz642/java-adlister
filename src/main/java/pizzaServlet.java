import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(name = "pizzaServlet", urlPatterns = "/pizza-order")
public class pizzaServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("pizzaOrderForm.jsp").forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request, response);
        if (request.getMethod().equalsIgnoreCase("post")) {
            String crust = request.getParameter("crust");
            String sauce = request.getParameter("sauce");
            String size = request.getParameter("size");
            System.out.println(crust);
        }

    }

//    private void processRequest(HttpServletRequest request, HttpServletResponse response) {
//    }
}
