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
        <h1>bom dia</h1>
        <?php
        include_once "testeCookie2.php";
        setcookie("nome", "limonada", time() + (30));
        setcookie("qtvisitas", 1, $tempomaximo);
        ?>
        <p><a href="testeCookie2.php">testar cookie criado.</a></p>
    </body>
</html>
