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
                $("#enviar").on("click",function () {

                    $.ajax({
                        url: 'ServletAlumno',
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
        <h2>Datos de Alumno</h2>
        <form id="formx" method="post">
            <table>
                <tr>
                    <td>
                        Nombre
                    </td>
                    <td>
                        <input type="text" name="nom">
                    </td>
                </tr>
                 <tr>
                    <td>
                        Sexo
                    </td>
                    <td>
                        <input type="radio" name="sex" value="Masculino">Masculino
                        <input type="radio" name="sex" value="Femenino">Femenino
                    </td>
                </tr>
                <tr>
                    <td>
                       Deportes
                       <table>
                            <tr><td><input type="checkbox"  name="dep"value="Futbol">Futbol</td></tr>
                            <tr><td><input type="checkbox"  name="dep"value="voley">Voley</td></tr>
                            <tr><td><input type="checkbox"  name="dep"value="Karate">Karate</td></tr>
                            <tr><td><input type="checkbox"  name="dep"value="Ciclismo">Ciclismo</td></tr>
                            <tr><td><input type="checkbox"  name="dep"value="Parapente">Parapente</td></tr>
                        </table>
                    </td>
                    <td>
                        
                    </td>
                </tr>
                <tr>
                    <td>Especialidad
                    </td>
                    <td>
                        <select name="esp">
                            <option>Administracioin</option>
                            <option>Ing. de Sistemas</option>
                            <option>Ing. Electronica</option>
                            <option>Ing.Ambiental</option>
                            <option>Ing. Mecanica</option>
                        </select>
                    </td>
                </tr>
                <tr>
                    <td>Cursos
                    </td>
                    <td>
                        <select name="cur" multiple>
                            <option>Java</option>
                            <option>Base de Datos</option>
                            <option>UML</option>
                            <option>JavaScript</option>
                            <option>Oracle</option>
                        </select>
                    </td>
                </tr>
            </table>
            <tr>
                    <td>
                    </td>
                    <td>
                        <button type="button" id="enviar">Enviar</button>
                    </td>
                </tr>
        </form>
        <br><br>
        <hr>
        <table id="tabdatos">
            
        </table>
    </body>
</html>
