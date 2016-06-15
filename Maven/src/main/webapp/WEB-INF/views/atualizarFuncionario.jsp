<%-- 
    Document   : atualizarFuncionario
    Created on : 07/06/2016, 20:52:16
    Author     : Matheus
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>ATUALIZAR FUNCIONARIO</title>
    </head>
    <body>
        <h1>Atualizar Funcionario</h1>

        <form action="funcionario/atualizar" method="post">

            <div> Número do Contrato <input type="text" name="numContrato"> </div> </br>

            <div> Nome <input type="text" name="nomeFun"> </div>
            <div> Idade <input type="text" name="idadeFun"> </div>
            <div> Telefone <input type="text" name="telefoneFun"> </div>
            <div> Rua <input type="text" name="ruaFun"> </div>
            <div> Bairro <input type="text" name="bairroFun"> </div>
            <div> Cidade <input type="text" name="cidadeFun"> </div>
            <div> Senha <input type="text" name="senhaFun"> </div>

            <input type="submit" value="Atualizar">

        </form>
    </body>
</html>
