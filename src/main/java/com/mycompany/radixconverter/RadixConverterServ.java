/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.radixconverter;

import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.Integer.parseInt;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author noguk
 */
@WebServlet(name = "RadixConverterServ", urlPatterns = {"/convert"})
public class RadixConverterServ extends HttpServlet {
      
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
          int dec = parseInt(request.getParameter("dec"));
        String base = request.getParameter("base");
        String result = null, bas = null;
        switch(base){
            case "h": result = Integer.toHexString(dec);
            bas = "Hexadecimal";
            break;
            case "b":result=Integer.toBinaryString(dec); 
            bas = "Binary";
            break;    
            case "o": result=Integer.toOctalString(dec); 
            bas = "Octal";
            break;    
        }
       
        request.setAttribute("bas" , bas);
        request.setAttribute("result" , result);
        request.setAttribute("dec" , dec);
       
       String resultpage="result.jsp";
       RequestDispatcher dispatcher = request.getRequestDispatcher(resultpage);
       dispatcher.forward(request,response);
    }
}
