<%-- 
    Document   : buscarFuncionario
    Created on : 07/06/2016, 20:52:27
    Author     : Matheus
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>BUSCAR FUNCIONARIO</title>
    </head>
    <body>
        <h1>Buscar Funcionario</h1>
        
        <form action="funcionario/buscar" method="post">
          
            <div>informe o Número do Contrato <input type="text" name="numContrato"> </div>
            
            <input type="submit" value="Pesquisar">
        
        </form>
    </body>
</html>
