/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda.controlador.articulo;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javafx.scene.control.Alert;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import tienda.modelo.bean.Articulo;
import tienda.modelo.dao.ArticuloDAO;

@WebServlet(name = "ServletArticulo", urlPatterns = {"/ServletArticulo", "/ServletFormBuscarArt", "/ServletBuscarArt"})
public class ServletArticulo extends HttpServlet {

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
            String path = request.getServletPath();
            if (path.equals("/ServletFormBuscarArt")) {
                request.getRequestDispatcher("WEB-INF/formBuscarArt.jsp").forward(request, response);
            }
            if (path.equals("/ServletBuscarArt")) {
                String art = request.getParameter("art");
                if( art != "" ){
                      ArticuloDAO adao=new ArticuloDAO ();
                 ArrayList<Articulo> lista=adao.buscar(art);
                
                for (Articulo x : lista) {
                    out.println("<tr>");
                    out.println("<td>"+x.getCodigo()+"</td>");
                    out.println("<td>"+x.getNombre()+"</td>");
                    out.println("<td>"+x.getDescripcion()+"</td>");
                    out.println("<td>"+x.getPrecio()+"</td>");
                    out.println("</tr>");
                }                   
                }else{
                  
                }
                 
            }

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
