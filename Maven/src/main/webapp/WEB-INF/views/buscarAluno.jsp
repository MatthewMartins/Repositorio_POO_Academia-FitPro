<%-- 
    Document   : buscarAluno
    Created on : 07/06/2016, 14:41:19
    Author     : Matheus
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>BUSCAR ALUNO</title>
    </head>
    <body>
        <h1>Buscar Aluno</h1>
        
        <form action="aluno/buscar" method="post">
          
            <div>informe o Número de Matricula <input type="text" name="numMatricula"> </div>
            
            <input type="submit" value="Pesquisar">
        
        </form>
    </body>
</html>
