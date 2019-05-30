
package tienda.controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import tienda.modelo.dao.ArticuloDao;
import tienda.modelo.dao.ClienteDao;
import tienda.modelo.dao.EmpleadoDao;

@WebServlet(name = "ServletTienda", urlPatterns = {"/ServletTienda","/Lista_1","/Lista_2","/Lista_3","/Lista_4","/Lista_5"
        ,"/Lista_6","/Lista_7","/Lista_8","/Lista_9","/Lista_10","/Lista_11","/Lista_12"})
public class ServletTienda extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
       String path = request.getServletPath();
       if(path.equals("/Lista_1")){
           String nombre = request.getParameter("nombre");
           if( nombre == null){
                request.getRequestDispatcher("WEB-INF/Lista_1.jsp").forward(request, response);
           }else{
                request.setAttribute("Lista", new ArticuloDao().Listar1(nombre));
                request.getRequestDispatcher("WEB-INF/Lista_1.jsp").forward(request, response);
           }          
       }
       if(path.equals("/Lista_2")){
           String nombre = request.getParameter("nombre");
           if( nombre == null){
                request.getRequestDispatcher("WEB-INF/Lista_2.jsp").forward(request, response);
           }else{
                request.setAttribute("Lista", new EmpleadoDao().Listar2(nombre));
                request.getRequestDispatcher("WEB-INF/Lista_2.jsp").forward(request, response);
           }
       }
       if(path.equals("/Lista_3")){
           String f1 = request.getParameter("fechai");
            String f2 = request.getParameter("fechaf");
           if( f1 == null && f2 == null ){
                request.getRequestDispatcher("WEB-INF/Lista_3.jsp").forward(request, response);
           }else{
                request.setAttribute("Lista", new ArticuloDao().Listar3(f1, f2));
                request.getRequestDispatcher("WEB-INF/Lista_3.jsp").forward(request, response);
           }
       }
       if(path.equals("/Lista_4")){
           String nombre = request.getParameter("nombre");
           if( nombre == null ){
                request.getRequestDispatcher("WEB-INF/Lista_4.jsp").forward(request, response);
           }else{
                request.setAttribute("Lista", new EmpleadoDao().Listar4(nombre));
                request.getRequestDispatcher("WEB-INF/Lista_4.jsp").forward(request, response);
           }
       }
       if(path.equals("/Lista_5")){
                request.setAttribute("Lista", new ArticuloDao().Listar5());
                request.getRequestDispatcher("WEB-INF/Lista_5.jsp").forward(request, response);
       }
       if(path.equals("/Lista_6")){
           String nombre = request.getParameter("nombre");
           if( nombre == null ){
                request.getRequestDispatcher("WEB-INF/Lista_6.jsp").forward(request, response);
           }else{
                request.setAttribute("Lista", new ArticuloDao().Listar6(nombre));
                request.getRequestDispatcher("WEB-INF/Lista_6.jsp").forward(request, response);
           }
       }
       if(path.equals("/Lista_7")){
                request.setAttribute("Lista", new ClienteDao().Listar7());
                request.getRequestDispatcher("WEB-INF/Lista_7.jsp").forward(request, response);
       }
       if(path.equals("/Lista_8")){
                request.setAttribute("Lista", new ClienteDao().Listar8());
                request.getRequestDispatcher("WEB-INF/Lista_8.jsp").forward(request, response);
       }
       if(path.equals("/Lista_9")){
                request.setAttribute("Lista", new ArticuloDao().Listar9());
                request.getRequestDispatcher("WEB-INF/Lista_9.jsp").forward(request, response);
       }
       if(path.equals("/Lista_10")){
                request.setAttribute("Lista", new ClienteDao().Listar10());
                request.getRequestDispatcher("WEB-INF/Lista_10.jsp").forward(request, response);
       }
       if(path.equals("/Lista_11")){
                request.setAttribute("Lista", new ArticuloDao().Listar11());
                request.getRequestDispatcher("WEB-INF/Lista_11.jsp").forward(request, response);
       }
       if(path.equals("/Lista_12")){
                request.setAttribute("Lista", new ArticuloDao().Listar12());
                request.getRequestDispatcher("WEB-INF/Lista_12.jsp").forward(request, response);
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
