<%-- 
    Document   : historicoAvaliacoesAluno
    Created on : 22/06/2016, 18:05:45
    Author     : Matheus
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>HISTORICO DE AVALIACOES DESSE ALUNO</title>
    </head>
    <body>
        <h1>Historico de Avaliações desse Aluno</h1>
        
        <form action="aluno/historicoAvaliacao" method="post">
            
            <div>Informe o numero de matricula do aluno: <input type="text" name="numMatricula"> </div>
            
            <input type="submit" value="Enviar">
        
        </form>
    </body>
</html>
