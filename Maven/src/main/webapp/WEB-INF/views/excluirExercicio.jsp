<%-- 
    Document   : excluirExercicio
    Created on : 17/06/2016, 19:12:34
    Author     : Matheus
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>EXCLUIR EXERCICIO</title>
    </head>
    <body>
        <h1>Excluir Exercicio</h1>
        
        <form action="exercicio/remover" method="post">
            
            <div>Informe o ID do Exercicio<input type="text" name="idExercicio"> </div>
            
            <input type="submit" value="Excluir">
        
        </form>
    </body>
</html>
