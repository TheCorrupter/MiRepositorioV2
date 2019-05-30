<%-- 
    Document   : Lista_5
    Created on : May 28, 2019, 7:55:42 PM
    Author     : RAFAEL
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="tienda.modelo.bean.Articulo"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <body>
        <h1></h1>
        <%
            ArrayList<Articulo> Ar = (ArrayList<Articulo>)request.getAttribute("Lista");
        %>
        <table border="1" style="margin-top: 20px">
            <thead>
                <tr>
                    <th>IDARTICULO</th>
                    <th>NOMBRE</th>
                    <th>DESCRIPCION</th>
                    <th>PRECIO</th>
                    <th>FOTO</th>
                    <th>CATEGORIA</th>
                </tr>
            </thead>       
                <% for ( Articulo x : Ar) { %>
                <tr>
                    <td><%=x.getIdarticulo()%></td>
                    <td><%=x.getNombre()%></td>
                    <td><%=x.getDescripcion()%></td>
                    <td><%=x.getPrecio()%></td>
                    <td><%=x.getFoto()%></td>
                    <td><%=x.getIdcategoria()%></td>
                </tr>
                <%}%>
        </table>

    </body>
</html>
