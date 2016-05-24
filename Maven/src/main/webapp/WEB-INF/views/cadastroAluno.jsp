<%-- 
    Document   : cadastroAluno
    Created on : 17/05/2016, 15:58:02
    Author     : Matheus
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Fase de testes</title>
    </head>
    <body>
        <h1>Cadastro de Aluno</h1>
        <!--nao usar formaluarios por enquanto pq ele retorna diferente de JSON -->
        <form action="Controlador/aluno/adicionar" method="post">
            
            <div> nome <input type="text" name="nome"> </div>
            <input type="submit" value="Enviar">
        </form>
    </body>
</html>
