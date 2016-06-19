<%-- 
    Document   : buscarAvaliacao
    Created on : 17/06/2016, 19:13:22
    Author     : Matheus
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>BUSCAR AVALIACAO</title>
    </head>
    <body>
        <h1>Buscar Avaliacao</h1>
        
        <form action="avaliacao/buscar" method="post">
            
            <div>Informe o ID da Avaliacao<input type="text" name="idAvaliacao"> </div>
            
            <input type="submit" value="Buscar">
        
        </form>
    </body>
</html>
