<%-- 
    Document   : Lista_3
    Created on : May 28, 2019, 7:55:29 PM
    Author     : RAFAEL
--%>

<%@page import="tienda.modelo.bean.Detalle"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>ARTICULOS SEGUN CATEGORIA</h1>
        <%
            ArrayList<Detalle> De = (ArrayList<Detalle>)request.getAttribute("Lista");
        %>
        <form action="Lista_3" method="POST">
            <table>
                <tr>
                    <td>Fecha Inicial</td>
                    <td><input type="text" name="fechai" placeholder="2000-01-01" ></td>
                </tr>
                <tr>
                    <td>Fecha Final</td>
                    <td><input type="text" name="fechaf" placeholder="2000-01-01"></td>
                </tr>
                <tr>
                    <td><input type="submit" value="Buscar"></td>
                </tr>
            </table>
        </form>
        <table border="1" style="margin-top: 20px">
            <thead>
                <tr>
                    <th>IDPEDIDO</th>
                    <th>FECHA</th>
                    <th>TOTAL</th>
                    <th>NOMBRE</th>
                    <th>APELLIDO PATERNO</th>
                    <th>APELLIDO MATERNO</th>
                    <th>CARGO</th>
                    <th>APELLIDOS CLIENTE</th>
                    <th>NOMBRES CLIENTE</th>
                    <th>EMAIL</th>
                    <th>PAIS</th>
                    
                </tr>
            </thead>
                <% if ( De != null) { %>
                <% for ( Detalle x : De) { %>
                <tr>
                    <td><%=x.getIdpedido()%></td>
                    <td><%=x.getFecha()%></td>
                    <td><%=x.getTotal()%></td>
                    <td><%=x.getNombre()%></td>
                    <td><%=x.getApepaterno()%></td>
                    <td><%=x.getApematerno()%></td>
                    <td><%=x.getCargo()%></td>
                    <td><%=x.getApellidos()%></td>
                    <td><%=x.getNombres()%></td>
                    <td><%=x.getEmail()%></td>
                    <td><%=x.getPais()%></td>
                </tr>
                <%}}%>
        </table>

    </body>
</html>
