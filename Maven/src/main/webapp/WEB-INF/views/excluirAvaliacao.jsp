<%-- 
    Document   : excluirAvaliacao
    Created on : 17/06/2016, 19:12:13
    Author     : Matheus
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>EXCLUIR AVALIACAO</title>
    </head>
    <body>
        <h1>Excluir Avaliacao</h1>
        
        <form action="avaliacao/remover" method="post">
            
            <div>Informe o ID da Avaliacao<input type="text" name="idAvaliacao"> </div>
            
            <input type="submit" value="Excluir">
        
        </form>
    </body>
</html>
