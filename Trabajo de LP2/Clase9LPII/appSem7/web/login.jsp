<%-- 
    Document   : login
    Created on : 09/05/2019, 08:37:05 AM
    Author     : Usuario
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        
        <link href="bootstrap/css/bootstrap.css" rel="stylesheet" type="text/css"/>
        <link href="bootstrap/css/bootstrap-responsive.min.css" rel="stylesheet" type="text/css"/>
       
        <style type="text/css">    
            body {
                padding-top: 40px;
                padding-bottom: 40px;
                background-color: #f5f5f5;
            }

            .form-signin {
                max-width: 300px;
                padding: 19px 29px 29px;
                margin: 0 auto 20px;
                background-color: #fff;
                border: 1px solid #e5e5e5;
                -webkit-border-radius: 5px;
                -moz-border-radius: 5px;
                border-radius: 5px;
                -webkit-box-shadow: 0 1px 2px rgba(0,0,0,.05);
                -moz-box-shadow: 0 1px 2px rgba(0,0,0,.05);
                box-shadow: 0 1px 2px rgba(0,0,0,.05);
            }
            .form-signin .form-signin-heading,
            .form-signin .checkbox {
                margin-bottom: 10px;
            }
            .form-signin input[type="text"],
            .form-signin input[type="password"] {
                font-size: 16px;
                height: auto;
                margin-bottom: 15px;
                padding: 7px 9px;
            }

        </style>
    </head>
    <body>
        <%
            //valor cuando usuario es incorrecto
        String msg=(String)request.getAttribute("msg");
        %>
        <h1></h1>
      
        <div class="container">

            <form class="form-signin" action="validarUser" method="post">
                <h2 class="form-signin-heading">Iniciar Sesion</h2>
                <input  name="txtus"type="text" class="input-block-level" placeholder="Usuario">
                <input name="txtpas" type="password" class="input-block-level" placeholder="Password">
                <label class="checkbox">
                    <%=msg!=null? msg:""%>
                </label>
                <button class="btn btn-large btn-primary" type="submit">Aceptar</button>
            </form>

        </div> <!-- /container -->

    </body>
</html>
