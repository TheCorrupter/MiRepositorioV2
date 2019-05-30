<%-- 
    Document   : Lista_8
    Created on : May 28, 2019, 7:56:09 PM
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
            ArrayList<Pais> pa = (ArrayList<Pais>)request.getAttribute("Lista");
        %>
        <table border="1">
            <thead>
                <tr>
                    <th>PAIS</th>
                    <th>FECHA</th>
                    <th>TOTAL</th>
                    <th>NOMBRE CLIENTE</th>
                </tr>
            </thead>
            <% for ( Pais x : pa ) { %>
                 <tr>
                    <td><%=x.getPais()%></td>
                    <td><%=x.getFecha()%></td>
                    <td><%=x.getTotal()%></td>
                    <td><%=x.getNombres()%></td>
                </tr>             
                <%}%>
        </table>
    </body>
</html>
