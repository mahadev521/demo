import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.*;
import javax.servlet.http.*;

public class myServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
           String uname=request.getParameter("email");
           String pass= request.getParameter("pass");
           if (uname.equals("naveen@gmail.com") && pass.equals("12345")){
            RequestDispatcher rs = request.getRequestDispatcher("Welcome");
            rs.forward(request, response);
           }
           else{
                RequestDispatcher rs = request.getRequestDispatcher("notc.html");
                 rs.forward(request, response);
           }
        } finally { 
            out.close();
        }
    } 
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        processRequest(request, response);
    } 

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }
}
