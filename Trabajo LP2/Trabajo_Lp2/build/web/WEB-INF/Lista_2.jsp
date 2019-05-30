<%-- 
    Document   : Lista_2
    Created on : May 28, 2019, 7:55:18 PM
    Author     : RAFAEL
--%>

<%@page import="tienda.modelo.bean.Empleado"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <h1>Pedidos</h1>
        <%
            ArrayList<Empleado> Em = (ArrayList<Empleado>)request.getAttribute("Lista");
        %>
        <form action="Lista_2" method="POST">
            Buscar por Empleado<input type="text" name="nombre" >
            <input type="submit" value="Buscar">
        </form>
        <table border="1" style="margin-top: 20px">
            <thead>
                <tr>
                    <th>IDEMPLEADO</th>
                    <th>NOMBRE EMPLEADO</th>
                    <th>APELLIDO PATERNO</th>
                    <th>APELLIDO MATERNO</th>
                    <th>CARGO</th>
                    <th>NOMBRE ARTICULO</th>
                    <th>DESCRIPCION</th>
                    <th>PRECIO</th>
                    <th>FOTO</th>
                    <th>PRECIO</th>
                    <th>CANTIDAD</th>
                    <th>SUBTOTAL</th>
                    <th>FECHA</th>
                    <th>TOTAL</th>
                    <th>APELLIDOS CLIENTE</th>
                    <th>NOMBRES CLIENTE</th>
                    <th>EMAIL</th>
                    <th>PAIS</th>
                </tr>
            </thead>
                <% if ( Em != null) { %>
                <% for ( Empleado x : Em) { %>
                <tr>
                    <td><%=x.getIdempleado()%></td>
                    <td><%=x.getNombre()%></td>
                    <td><%=x.getApepaterno()%></td>
                    <td><%=x.getApematerno()%></td>
                    <td><%=x.getCargo()%></td>
                    <td><%=x.getNombrea()%></td>
                    <td><%=x.getDescripcion()%></td>
                    <td><%=x.getPrecio()%></td>
                    <td><%=x.getFoto()%></td>
                    <td><%=x.getPrecio()%></td>
                    <td><%=x.getCantidad()%></td>
                    <td><%=x.getSubtotal()%></td>
                    <td><%=x.getFecha()%></td>
                    <td><%=x.getTotal()%></td>
                    <td><%=x.getApelidosc()%></td>
                    <td><%=x.getNombresc()%></td>
                    <td><%=x.getEmail()%></td>
                    <td><%=x.getPais()%></td>
                </tr>
                <%}}%>
        </table>
</html>
