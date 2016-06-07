<%-- 
    Document   : excluirAluno
    Created on : 07/06/2016, 14:41:29
    Author     : Matheus
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>EXCLUIR ALUNO</title>
    </head>
    <body>
        
        <form action="aluno/remover" method="post">
            
            <h1>Excluir Aluno</h1>
            
            <div>Informe o Número de Matricula <input type="text" name="numMatricula"> </div>
            
            <input type="submit" value="Excluir">
        
        </form>
    </body>
</html>
