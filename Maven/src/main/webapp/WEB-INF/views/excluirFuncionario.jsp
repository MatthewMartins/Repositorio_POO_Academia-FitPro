<%-- 
    Document   : excluirFuncionario
    Created on : 07/06/2016, 20:52:42
    Author     : Matheus
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>EXCLUIR FUNCIONARIO</title>
    </head>
    <body>
        <h1>Excluir Funcionario</h1>
        
        <form action="funcionario/remover" method="post">
            
            <h1>Excluir Aluno</h1>
            
            <div>Informe o Número do Contrato <input type="text" name="numContrato"> </div>
            
            <input type="submit" value="Excluir">
        
        </form>
    </body>
</html>
