<%-- 
    Document   : cadastrarAvaliacao
    Created on : 14/06/2016, 23:39:33
    Author     : Matheus
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>CADASTRAR AVALIACAO</title>
    </head>
    <body>
        <h1>Cadastrar Avaliacao</h1>

        <form action= "avaliacao/adicionar" method="post"> <!--ng-WebServerController = "ControladorAlunos as controladorAluno" --> 

            <div> Numero de Matricula do Aluno: <input type="text" name="numMatricula"> </div> </br>

            <div> ID <input type="text" name="idAvaliacao"> </div>
            <div> Peso <input type="text" name="peso"> </div>
            <div> Altura <input type="text" name="altura"> </div>
            <h6>Tamanho do:</h6></br>
            <div> Peito <input type="text" name="peito"> </div>
            <div> Biceps <input type="text" name="biceps"> </div>
            <div> Triceps<input type="text" name="triceps"> </div>
            <div> Ombro <input type="text" name="ombro"> </div>
            <div> Costa <input type="text" name="costa"> </div>
            <div> Coxa <input type="text" name="coxa"> </div>
            <div> Panturrilha <input type="text" name="panturrilha"> </div>
            <div> Quadril <input type="text" name="quadril"> </div>

            <input type="submit" value="Cadastrar">

        </form>
    </body>
</html>
