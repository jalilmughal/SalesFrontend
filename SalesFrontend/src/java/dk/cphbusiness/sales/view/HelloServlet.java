package dk.cphbusiness.sales.view;

import dk.cphbusiness.sales.contract.SalesManager;
import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "HelloServlet", urlPatterns = {"/Hello"})
public class HelloServlet extends HttpServlet {
    @EJB
    private SalesManager manager;

    @Override
    protected void service(
            HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
        
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet HelloServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Greeting: " +manager.sayHello("3rd semester") + "</h1>");
            out.println("<h1>To: " +manager.sayHelloTo("kurt@mail.dk") + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }
}
