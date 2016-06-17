<%-- 
    Document   : atualizarTreino
    Created on : 17/06/2016, 18:51:48
    Author     : Matheus
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>ATUALIZAR TREINO</title>
    </head>
    <body>
        <h1>Atualizar Treino</h1>
        
        <form action="treino/atualizar" method="post">

            <div>ID do treino: <input type="text" name="idTreino"> </div>
            <!--<div> Informe o numero do contrato do funcionario <input type="text" name="numContrato"> </div></br>-->

            <div> Nome do Treino<input type="text" name="nomeTreino"> </div>
            <div> Data de expiração <input type="text" name="dataExpiracao"> </div>

            <input type="submit" value="Atualizar Treino">

        </form>
    </body>
</html>
