<%-- 
    Document   : cadastrarFuncionario
    Created on : 07/06/2016, 20:51:55
    Author     : Matheus
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>CADASTRAR FUNCIONARIO</title>
    </head>
    <body>
        <h1>cadastrar funcionario</h1>
        <form action="funcionario/adicionar" method="post">
            <div> Nome <input type="text" name="nomeFun"> </div> <!--Nome : <input type="text" name="nome" ng-model = controladorAluno.aluno.nome></br> -->
            <div> Idade <input type="text" name="idadeFun"> </div> 
            <div> Telefone <input type="text" name="telefoneFun"> </div>
            <div> Rua <input type="text" name="ruaFun"> </div>
            <div> Bairro <input type="text" name="bairroFun"> </div>
            <div> Cidade <input type="text" name="cidadeFun"> </div>
            <div> Número do contrato <input type="text" name="numContrato"> </div>
            <div> Nivel de Acesso <input type="text" name="nivelAcesso"> </div>
            <div> Senha <input type="text" name="senhaFun"> </div>
           
            <input type="submit" value="Cadastrar">
        </form>

    </body>
</html>
