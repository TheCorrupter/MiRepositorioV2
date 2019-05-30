<%-- 
    Document   : 02.ejemploajax
    Created on : 30/05/2019, 11:21:44 AM
    Author     : Usuario
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <script src="js/jquery.js" type="text/javascript"></script>
        <script>
            $(function () {
                $("#art").on("keyup",function () {
                    $.ajax({
                        url: 'ServletBuscarArt',
                        type: 'POST',
                        data: $('#formx').serialize(),
                        success:function(datos){    
                            $("#tabdatos").html(datos);
                            }
                    }) ;   
                }); //fin del evento click        
            });//fin de la funcion anonima

           
        </script>
    </head>
    <body>
        <h2>Buscar Articulo</h2>
        <form id="formx" method="post">
            <table>
                <tr>
                    <td>
                        Digite articulo
                    </td>
                    <td>
                        <input type="text" name="art" id="art">
                    </td>
                </tr>   
        </form>
        <br><br>
        <hr>
        <table id="tabdatos" >
            
        </table>
    </body>
</html>
