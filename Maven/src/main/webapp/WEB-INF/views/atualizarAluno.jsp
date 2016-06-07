<%-- 
    Document   : atualizarAluno
    Created on : 07/06/2016, 14:40:58
    Author     : Matheus
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>ATUALIZAR ALUNO</title>
    </head>
    <body>
        <h1>Atualizar Aluno</h1>
        <form action="aluno/atualizar" method="post">
     
            <div> Número de Matricula <input type="text" name="numMatricula"> </div> </br>
            
            <div> Nome <input type="text" name="nome"> </div>
            <div> Idade <input type="text" name="idade"> </div>
            <div> Telefone <input type="text" name="telefone"> </div>
            <div> Rua <input type="text" name="rua"> </div>
            <div> Bairro <input type="text" name="bairro"> </div>
            <div> Cidade <input type="text" name="cidade"> </div>
            
            <div> Senha <input type="text" name="senha"> </div>
            
            <input type="submit" value="Enviar">
        
        </form>
        
    </body>
</html>
