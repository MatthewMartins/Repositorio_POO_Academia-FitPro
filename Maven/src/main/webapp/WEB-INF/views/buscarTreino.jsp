<%-- 
    Document   : buscarTreino
    Created on : 17/06/2016, 19:13:06
    Author     : Matheus
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>BUSCAR TREINO</title>
    </head>
    <body>
        <h1>Buscar Treino</h1>
        
        <form action="treino/buscar" method="post">
            
            <div>Informe o ID do Treino<input type="text" name="idTreino"> </div>
            
            <input type="submit" value="Buscar">
        
        </form>
    </body>
</html>
