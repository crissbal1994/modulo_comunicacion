<%-- 
    Document   : archivos
    Created on : Jul 2, 2017, 10:52:24 AM
    Author     : helio
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        Archivos para el grupo ${id_grupo}
        <a href="chat?id_grupo=${id_grupo}&id_Usuario=${id_usuario}">Lista de archivos</a>
    </body>
</html>
