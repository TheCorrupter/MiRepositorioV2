
package tienda.controlador.empleado;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import tienda.controlador.usuario.Empleado;
import tienda.modelo.dao.EmpleadoDAO;


@WebServlet(name = "ServletEmpleado", urlPatterns = {"/ServletEmpleado","/listarEmpleados","/nuevoEmpleado","/grabarEmpleado","/editarEmpleado","/eliminarEmpleado"})
public class ServletEmpleado extends HttpServlet {

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
        String path=request.getServletPath();
        
        if(path.equals("/listarEmpleados")){
           
        
      request.setAttribute("listEmp",new EmpleadoDAO().listar());
      //ir a empleado
      request.getRequestDispatcher("WEB-INF/empleados.jsp").forward(request, response);
        }
      if(path.equals("/nuevoEmpleado")){ 
          //enviar objeto empleado
          request.setAttribute("emp", new Empleado());
     
      request.getRequestDispatcher("WEB-INF/fromEmpleado.jsp").forward(request, response);
        
      } 
      
       if(path.equals("/editarEmpleado")){ 
       //capturar valor de id que viene por la URL
       int id=Integer.parseInt(request.getParameter("id"));
       
       
         //buscar empleado por su id y asignar un atributo
      request.setAttribute("emp",new EmpleadoDAO().buscarID(id));
   
      request.getRequestDispatcher("WEB-INF/fromEmpleado.jsp").forward(request, response);
      
      } 
       
      if(path.equals("/grabarEmpleado")){ 
          //capturar id de fromempleado
         int id = Integer.parseInt(request.getParameter("id"));
         Empleado emp=new Empleado();
          //obtener valores de los cuadros de texto de formEmpleado
          String nom=request.getParameter("nom");
          String ap=request.getParameter("ap");
          String am=request.getParameter("am");
          String ca=request.getParameter("ca");
          /*Asignar valor a las propiedades 
          del objeto empleado:encapsulamiento */
          emp.setNombre(nom);
          emp.setPaterno(ap);
          emp.setMaterno(am);
          emp.setCargo(ca);
          //grabar nuevo empleado
          EmpleadoDAO em= new EmpleadoDAO();
          if(id>0){
         emp.setIdempelado(id);
          //editar
      em.editar(emp);
        
      } else{
              
       //request.getRequestDispatcher("WEB-INF/empleados.jsp").forward(request, response); 
       em.registrar(emp);
      
    }
           // invocar o redireccionar el servlet listarEmpleados
       response.sendRedirect("listarEmpleados"); //invocar por fuera la lista
      }
      
       if(path.equals("/eliminarEmpleado")){ 
           EmpleadoDAO em= new EmpleadoDAO();
           int id=Integer.parseInt(request.getParameter("id"));
           em.eliminar(id);
           response.sendRedirect("listarEmpleados");
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
    