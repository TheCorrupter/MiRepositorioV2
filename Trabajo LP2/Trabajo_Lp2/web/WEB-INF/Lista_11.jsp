<%-- 
    Document   : Lista_11
    Created on : May 28, 2019, 7:56:33 PM
    Author     : RAFAEL
--%>

<%@page import="tienda.modelo.bean.Articulo"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
     <body>
        <h1>ARTICULOS QUE NO HAN SIDO PEDIDOS</h1>
        <%
            ArrayList<Articulo> Ar = (ArrayList<Articulo>)request.getAttribute("Lista");
        %>
        <table border="1" style="margin-top: 20px">
            <thead>
                <tr>
                    <th>IDARTICULO</th>
                    <th>NOMBRE</th>
                    <th>PRECIO</th>
                </tr>
            </thead>
                <% for ( Articulo x : Ar) { %>
                <tr>
                    <td><%=x.getIdarticulo()%></td>
                    <td><%=x.getNombre()%></td>
                    <td><%=x.getPrecio()%></td>
                </tr>
                <%}%>
        </table>

    </body>
</html>
