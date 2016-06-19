<%-- 
    Document   : excluirTreino
    Created on : 17/06/2016, 19:12:03
    Author     : Matheus
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>EXCLUIR TREINO</title>
    </head>
    <body>
        <h1>Excluir Treino</h1>
        
        <form action="treino/remover" method="post">
            
            <div>Informe o ID do treino<input type="text" name="idTreino"> </div>
            
            <input type="submit" value="Excluir">
        
        </form>
    </body>
</html>
