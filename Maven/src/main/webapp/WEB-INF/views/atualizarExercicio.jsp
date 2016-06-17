<%-- 
    Document   : atualizarExercicio
    Created on : 14/06/2016, 21:03:11
    Author     : Matheus
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>ATUALIZAR EXERCICIO</title>
    </head>
    <body>
        <h1>Atualizar Exercicio</h1>
        <form action="exercicio/atualizar" method="post">
            <div> Id <input type="text" name="idExercicio"> </div>  </br>
            <div>Nome do exercício: <input type="" name="nomeExercicio"</div>
            <div> Descricao <input type="text" name="descricao"> </div>
            <div> Quantidade de series <input type="text" name="qtSeries"> </div>
            <div> Numero de repetiçoes <input type="text" name="numRepeticao"> </div>
            <div> Tempo de Descanso <input type="text" name="tempoDescanso"> </div>
            <input type="submit" value="Atualizar">
        </form>>
    </body>
</html>
