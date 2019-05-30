/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador.ajax2;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "ServletAlumno", urlPatterns = {"/ServletAlumno"})
public class ServletAlumno extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            //obtener dato del formx
            String nom = request.getParameter("nom");
            String sex = request.getParameter("sex");
            String esp = request.getParameter("esp");
            String d[] = request.getParameterValues("dep");
            String c[] = request.getParameterValues("cur");

            out.println("<tr>");
            out.println("<td>Nombre:</td>");
            out.println("<td>" + nom + "</td>");
            out.println("</tr>");

            out.println("<tr>");
            out.println("<td>Sexo:</td>");
            out.println("<td>" + sex + "</td>");
            out.println("</tr>");

            out.println("<tr>");
            out.println("<td>Deportes elegidos:</td>");
            out.println("<td></td>");
            out.println("</tr>");
            for (int i = 0; i < d.length; i++) {
                out.println("<tr>");
                out.println("<td><ul> <li>" + d[i] + "</li></ul></td>");
                out.println("</tr>");
            }
            out.println("<tr>");
            out.println("<td>Especialidad:</td>");
            out.println("<td>"+esp+"</td>");
            out.println("</tr>");

            out.println("<tr>");
            out.println("<td>Cursos elegidos:</td>");
            out.println("<td></td>");
            out.println("</tr>");

            out.println("<tr>");
            for (int i = 0; i < c.length; i++) {
                out.println("<td></td>");
                out.println("<td>" + c[i] + "</td>");
            }
            out.println("</tr>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
