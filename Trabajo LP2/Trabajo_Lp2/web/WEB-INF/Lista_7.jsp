<%-- 
    Document   : Lista_7
    Created on : May 28, 2019, 7:55:55 PM
    Author     : RAFAEL
--%>

<%@page import="tienda.modelo.bean.Pais"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Lista de Pais</h1>
        <%
            ArrayList<Pais> p = (ArrayList<Pais>)request.getAttribute("Lista");
        %>
        <table border="1">
            <thead>
                <tr>
                    <th>ID</th>
                    <th>PAIS</th>
                </tr>
            </thead>
            <% for ( Pais x : p ) { %>
                 <tr>
                    <td><%=x.getIdpais()%></td>
                    <td><%=x.getNombres()%></td>
                </tr>             
                <%}%>
        </table>

    </body>
</html>
