<%-- 
    Document   : cadastrarTreino
    Created on : 07/06/2016, 14:41:10
    Author     : Matheus
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>CADASTRAR TREINO</title>
    </head>
    <body>
        <h1>Cadastrar Treino</h1>
        
        <form action="treino/adicionar" method="post">
            <div>Inform o Número de Matricula do aluno  <input type="text" name="numMatricula"> </div>
            <!--<div> Informe o numero de matricula do funcionario <input type="text" name="nomeFun"> </div>-->
            
            <div> Nome do Treino<input type="text" name="nomeTreino"> </div>
            <div> Data de expiração <input type="text" name="dataExpiracao"> </div>
            
            <!--Colocar tambem um INPUT para pegar todos os exercicios desse treino -->
           
            <input type="submit" value="Adicionar Treino">
        
        </form>
    </body>
</html>
