<%-- 
    Document   : fromEmpleado
    Created on : 23/05/2019, 09:51:46 AM
    Author     : Usuario
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="bootstrap/css/bootstrap.css" rel="stylesheet" type="text/css"/>
        <title>JSP Page</title>
    </head>
    <body>
        <h1>:Empleado</h1>
        
        <table style="margin-left: 20 px">
            <form method="POST" action="grabarEmpleado">
                <tr>
                    <th>Nombre <input name="id" type="hidden" placeholder="Nombre" value="${emp.idempelado}"></th>
                    <th><input name="nom" type="text" placeholder="Nombre" value="${emp.nombre}"></th>
                    
                </tr>
         
                <tr>
                    <td>Apellido Paterno</td>
                    <td><input name="ap" type="text" placeholder="Apellido paterno" value="${emp.paterno}"></td>
                  
                </tr>
                
                
                <tr>
                    <td>Apellido Materno</td>
                    <td><input name="am" type="text" placeholder="Apellido materno" value="${emp.materno}"></td>
                  
                </tr>
                
                <tr>
                    <td>Cargo</td>
                    <td><input name="ca" type="text" placeholder="Cargo" value="${emp.cargo}"></td>
                  
                </tr>
                
                <tr>
                   
                    <td><input type="submit" value="Grabar" class="btn btn-success"></td>
                   
                </tr>
                
                
                
           
        </table>

        
        
        
    </body>
</html>
