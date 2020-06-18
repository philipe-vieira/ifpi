<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <meta charset="UTF-8">
        <title>COISA SEM NADA</title>
    </head>
    <body>
        <center>    
        <h1>Meu guarda roupas</h1>
        <?php
        $gaveta = array("meia", "cueca", "camisas");
        for ($i = 0; $i < 3; $i++) {
            echo "nome da gaveta: '$gaveta[$i]' </br>";
        }
        $gaveta[2] = "boné";
        $gaveta[] = "sapato";
        $gaveta[] = "calção";
        ?>
        <br>
       
        </center>  
    </body>
</html>
