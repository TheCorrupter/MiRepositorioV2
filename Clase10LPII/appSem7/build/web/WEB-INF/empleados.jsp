

<%@page import="java.util.ArrayList"%>
<%@page import="tienda.controlador.usuario.Empleado"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="bootstrap/css/bootstrap.css" rel="stylesheet" type="text/css"/>
        <title>JSP Page</title>
        
        <script> 
            function confirmar(){
                if(confirm("¿Esta seguro de eliminar registro?")){
                    return true;
                }
                return false;
            }
        
         </script> 
    </head>
    <body>
       <% 
           ArrayList<Empleado> listEmp=(ArrayList<Empleado>)request.getAttribute("listEmp");
            
        %>
        <h1> EMPLEADOS </h1>
        
        <table border="1" class="table-condensed">
            
            
            <thead>
                <tr Bgcolor="lightblue">
                    <th>CODIGO</th>
                    <th>NOMBRE</th>
                    <th>APELLIDO PATERNO</th>
                    <th>APELLIDO MATERNO</th>
                    <th>CARGO</th>
                    <th colspan="2"><a href="nuevoEmpleado"> Nuevo </a></th>
                </tr>
            </thead>
            <tbody>
                <%for(Empleado x:listEmp){%>
                <tr>
                    <td><%=x.getIdempelado()%></td>
                    <td><%=x.getNombre()%></td>
                    <td><%=x.getPaterno()%></td>
                    <td><%=x.getMaterno()%></td>
                    <td><%=x.getCargo()%></td>
                    <td><a href="editarEmpleado?id=<%=x.getIdempelado()%>">Editar</a></td>
                    <td><a href="eliminarEmpleado?id=<%=x.getIdempelado()%>" onclick="return confirmar()">Eliminar</a></td>   
                   
                    
                </tr>
                <%}%>
            </tbody>
        </table>

    </body>
</html>
