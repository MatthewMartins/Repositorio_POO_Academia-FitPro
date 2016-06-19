<%-- 
    Document   : buscarExercicio
    Created on : 17/06/2016, 19:12:55
    Author     : Matheus
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>BUSCAR EXERCICIO</title>
    </head>
    <body>
        <h1>Buscar Exercicio</h1>
        
        <form action="exercicio/buscar" method="post">
            
            <div>Informe o ID do Exercicio<input type="text" name="idExercicio"> </div>
            
            <input type="submit" value="Buscar">
        
        </form>
    </body>
</html>
