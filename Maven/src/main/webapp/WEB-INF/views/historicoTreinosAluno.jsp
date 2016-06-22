<%-- 
    Document   : historicoTreinoAluno
    Created on : 22/06/2016, 17:40:32
    Author     : Matheus
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>HISTORICO DE TREINO DE TAL ALUNO</title>
    </head>
    <body>
        <h1>Historico de Treinos do Aluno</h1>
        
        <form action="aluno/historicoTreino" method="post">
            
            <div>Informe o numero de matricula do aluno<input type="text" name="numMatricula"> </div>
            
            <input type="submit" value="Enviar">
        
        </form>
    </body>
</html>
