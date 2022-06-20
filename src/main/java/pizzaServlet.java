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
            String crust = request.getParameter("crustType");
            String sauce = request.getParameter("sauceType");
            String size = request.getParameter("toppings");
            String[] toppings = request.getParameterValues("topping");
//            String pepperoni = request.getParameter("pepperoni");
//            String pineapple = request.getParameter("pineapple");
//            String italian = request.getParameter("italian");
            String Submit = request.getParameter("Submit");
            System.out.println(crust);
        System.out.println(sauce);
        System.out.println(size);
//        System.out.println(pepperoni);
//        System.out.println(pineapple);
//        System.out.println(italian);
        System.out.println(Submit);

        for(String topping : toppings){
            System.out.println(topping);
        }
    }

    private void processRequest(HttpServletRequest request, HttpServletResponse response) {
    }
}
