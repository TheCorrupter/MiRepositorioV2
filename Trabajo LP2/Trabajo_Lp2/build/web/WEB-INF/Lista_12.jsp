<%-- 
    Document   : Lista_12
    Created on : May 28, 2019, 7:56:41 PM
    Author     : RAFAEL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Cantidad de articulos no pedidos</h1>
        <%
            int c = Integer.parseInt(request.getAttribute("Lista").toString());
        %>
        
        <p>La cantidad de articulos no pedidos es <%=c%></p>
        
    </body>
</html>
