<%-- 
    Document   : Lista1
    Created on : May 28, 2019, 7:54:46 PM
    Author     : RAFAEL
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="tienda.modelo.bean.Articulo"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Ingrese la Categoria</h1>
        <%
            ArrayList<Articulo> Ar = (ArrayList<Articulo>)request.getAttribute("Lista");
        %>
        <form action="Lista_1" method="POST">
            <input type="text" name="nombre" placeholder="Ingrese categoria..">
            <input type="submit" value="Buscar">
        </form>
        <table border="1" style="margin-top: 20px">
            <thead>
                <tr>
                    <th>IDARTICULO</th>
                    <th>NOMBRE</th>
                    <th>DESCRIPCION</th>
                    <th>PRECIO</th>
                    <th>FOTO</th>
                </tr>
            </thead>
                <% if ( Ar != null) { %>
                <% for ( Articulo x : Ar) { %>
                <tr>
                    <td><%=x.getIdarticulo()%></td>
                    <td><%=x.getNombre()%></td>
                    <td><%=x.getDescripcion()%></td>
                    <td><%=x.getPrecio()%></td>
                    <td><%=x.getFoto()%></td>
                </tr>
                <%}}%>
        </table>
    </body>
</html>
