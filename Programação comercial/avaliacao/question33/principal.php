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
        <p>
            <?php
            if (isset($_GET["erro"])) {
                if ($_GET["erro"] == 1) {
                    echo "Login e/ou senha inválidos";
                }elseif ($_GET["erro"] == 2) {
                    echo "Efetue login para acessar essa página";
                }
                
            }
            ?>
        </p>
        <form action="verificalogin.php" method="POST">
            <label>Usuário: </label>
            <input type="text" name="usuario"><br>
            <label>Senha: </label>
            <input type="password" name="senha"><br>
            <input type="submit" value="enviar">
        </form>
        <?php
        // put your code here
        ?>
    </body>
</html>
