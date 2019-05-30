<%-- 
    Document   : principal
    Created on : 09/05/2019, 08:37:34 AM
    Author     : Usuario
--%>

<%@page import="tienda.controlador.usuario.Empleado"%>
<%@page import="tienda.modelo.bean.Usuario"%>
<%@page import="tienda.modelo.bean.Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
       Empleado emp=(Empleado) request.getSession().getAttribute("emp");
        %>
        <h1>Principal</h1>
        <h2>Usuario:<%=emp.getNombre()+"  "+ emp.getPaterno()+" "+ emp.getMaterno()%>  [<a href="cerrarSesion">Cerrar Sesion</a>] </h2>
        <a href="">Listar articulos</a><br>
        
        <a href="">Buscar empleado</a>
        <a href="listarEmpleados">Listar Empleados</a>
    </body>
</html>
