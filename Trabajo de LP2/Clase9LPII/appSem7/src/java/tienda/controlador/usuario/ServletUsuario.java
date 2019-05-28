package tienda.controlador.usuario;

import tienda.modelo.dao.EmpleadoDAO;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import tienda.modelo.bean.Usuario;
import tienda.modelo.dao.UsuarioDAO;

@WebServlet(name = "ServletUsuario", urlPatterns = {"/ServletUsuario", "/validarUser", "/cerrarSesion"})
public class ServletUsuario extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        //obtener valor de urlpaterns
        String path = request.getServletPath();
        if (path.equals("/validarUser")) {
            //capturar datos del usuario
            String us = request.getParameter("txtus");
            String pa = request.getParameter("txtpas");
            //verificar usuario en el modelo
            UsuarioDAO ud = new UsuarioDAO();
            Usuario u = ud.validarUsuario(us, pa);
            if (u == null) {
                request.setAttribute("msg", "Usuario y/o password incorrecto...");
                request.getRequestDispatcher("login.jsp").forward(request, response);
            } else {
                //crear varible de sesion con el empleado emp
                request.getSession().setAttribute("emp", new EmpleadoDAO().buscarID(u.getIdempledo()));
                request.getRequestDispatcher("WEB-INF/principal.jsp").forward(request, response);
            }
        }
        if (path.equals("/cerrarSesion")) {
            request.getSession().invalidate();
            request.getRequestDispatcher("login.jsp").forward(request, response);
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
