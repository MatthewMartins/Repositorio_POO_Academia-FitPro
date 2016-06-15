<%-- 
    Document   : cadastroAluno
    Created on : 17/05/2016, 15:58:02
    Author     : Matheus
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <!--<script type="text/javascript" href="https://ajax.googleapis.com/ajax/libs/angularjs/1.5.6/angular.min.js"></script>  -->
        <!--<script type="text/javascript" href="js/JSConexaoHTMLComBD.js"></script>-->
        <title>Fase de testes</title>
    </head>
    <body> <!-- ng-aplicacao="aplicacao" -->
        <h1>Cadastro de Aluno</h1>
        <form action= "aluno/adicionar" method="post"> <!--ng-WebServerController = "ControladorAlunos as controladorAluno" --> 
            
            <h1>Cadastro de Aluno</h1>
            <div> Nome <input type="text" name="nome"> </div> <!--Nome : <input type="text" name="nome" ng-model = controladorAluno.aluno.nome></br> -->
            <div> Idade <input type="text" name="idade"> </div> 
            <div> Telefone <input type="text" name="telefone"> </div>
            <div> Rua <input type="text" name="rua"> </div>
            <div> Bairro <input type="text" name="bairro"> </div>
            <div> Cidade <input type="text" name="cidade"> </div>
            <div> Número de Matricula <input type="text" name="numMatricula"> </div>
            <div> Senha <input type="text" name="senha"> </div>
            <!--Essa lista de treinos e de avaliação precisa ser enviada vazia, para poder a variavel
                nao ficar nula e eu dps poder adicionar o treino e avaliacao nessas variaveis,
                como fazer isso?-->
            <div> Lista de Treinos <input type="text" name="treinoAlunos"> </div>
            <div> Avaliacao Fisica <input type="text" name="avaliacaoAlunos"> </div>
            <input type="submit" value="Enviar">
            <!-- <input type="button" value="Cadastrar" ng-click = "controladorAluno.enviar()"> -->
        </form>
    </body>
</html>
