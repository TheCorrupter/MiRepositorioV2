<%-- 
    Document   : Lista_10
    Created on : May 28, 2019, 7:56:23 PM
    Author     : RAFAEL
--%>

<%@page import="tienda.modelo.bean.Cliente"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <%
            ArrayList<Cliente> Cl = (ArrayList<Cliente>)request.getAttribute("Lista");
        %>
         <table border="1" style="margin-top: 20px">
            <thead>
                <tr>
                    <th>IDARTICULO</th>
                    <th>NOMBRE</th>
                    <th>PRECIO</th>
                </tr>
            </thead>
                <% for ( Cliente x : Cl) { %>
                <tr>
                    <td><%=x.getIdcliente()%></td>
                    <td><%=x.getApellidos()%></td>
                    <td><%=x.getNombres()%></td>
                    <td><%=x.getEmail()%></td>
                </tr>
                <%}%>
        </table>
    </body>
</html>
