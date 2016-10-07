/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servletHTML;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Alumno
 */
public class calcuser extends HttpServlet {
    float num1;
    float num2;
    int opc;
    float total;
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        num1 = Float.parseFloat(request.getParameter("Num1"));
        num2 = Float.parseFloat(request.getParameter("Num2"));
        opc = Integer.parseInt(request.getParameter("sele"));
        switch(opc){
            case 1:
                total = num1 + num2;
                break;
            case 2:
                total = num1 - num2;
                break;
            case 3:
                total = num1 * num2;
                break;
            case 4:
                total = num1 / num2;
        }
        PrintWriter out = new PrintWriter(response.getOutputStream());
        out.println("<html>");
        out.println("<head><title>Calculadora</title></head>");
        out.println("<body>");
        out.println("<p><h1><center>El total es: "+total+"</center></h1></p>");
        out.println("</body></html>");
        out.close();
    }
}
