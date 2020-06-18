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
        <form action="multiplica.php" method="GET">
            <label>Escolha um numero.</label>
            <select name="numero">
                <?php
                for($i = 1; $i <= 9; $i++){
                    echo "<option value='$i'>$i</option>";
                }
                ?>
            </select>
            <input type="submit" name="enviar">
        </form>
    </body>
</html>
