<%-- 
    Document   : cadastrarExercicio
    Created on : 14/06/2016, 21:02:58
    Author     : Matheus
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>CADASTRAR EXERCICIO</title>
    </head>
    <body>
        <h1>Cadastrar Exercicio</h1>
        <form action= "exercicio/adicionar" method="post">
            <div> Nome <input type="text" name="nomeExercicio"> </div> 
            <div> Id <input type="text" name="idExercicio"> </div> 
            <div> Descricao <input type="text" name="descricao"> </div>
            <div> Quantidade de series <input type="text" name="qtSeries"> </div>
            <div> Numero de repetiçoes <input type="text" name="numRepeticao"> </div>
            <div> Tempo de Descanso <input type="text" name="tempoDescanso"> </div>
            <input type="submit" value="Cadastrar">
        </form>
    </body>
</html>
