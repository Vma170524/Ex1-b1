/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Minh Anh
 */
@WebServlet(name = "CalculateServlet", urlPatterns = {"/Calculate"})
public class CalculateServlet extends HttpServlet {


  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
          throws ServletException, IOException {
    String num1 = request.getParameter("num1");
    String num2 = request.getParameter("num2");
    String op = request.getParameter("operation");
    
    float n1 = Float.parseFloat(num1);
    float n2 = Float.parseFloat(num2);
    float re=0;
    
    if("+".equals(op)){
      re=n1+n2;
      
    }else if("-".equals(op)){
      re=n1-n2;
    }else if("x".equals(op)){
      re=n1*n2;
    }else if("/".equals(op)){
      if(n2!=0){
        re=n1/n2;
      }else{
        String ERROR = "Can not divisor for 0";
    request.setAttribute("error", ERROR);
    request.getRequestDispatcher("index.jsp").forward(request, response);
      }
      
    }
    String RESULT = String.valueOf(re);
    request.setAttribute("Result", RESULT);
    request.getRequestDispatcher("Result.jsp").forward(request, response);
    
           
    
  }



}
