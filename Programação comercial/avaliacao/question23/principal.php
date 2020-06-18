<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <meta charset="UTF-8">
        <title></title>
    </head>
    <body>
        <form action="pagina_protegida.php" method="POST">
            <label>NOME: </label>
            <input type="text" name="nome">
            <label>SENHA: </label>
            <input type="password" name="senha">
            
            <input type="submit" name="enviar">
        </form>
        <?php
        // put your code here
        ?>
    </body>
</html>
