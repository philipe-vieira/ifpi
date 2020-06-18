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
        <form action="resposta.php" method="POST">
            <h2>Qual time potiguar você torce?</h2>
            <?php
            if (!isset($_COOKIE["voto"])){
                echo '<input type="checkbox" name="time" value="abc">ABC<br>
            <input type="checkbox" name="time" value="america">América<br>
            <input type="checkbox" name="time" value="alecrim">Alecrim<br>
            <input type="checkbox" name="time" value="Barsúnas">Baraúnas<br>
            <input type="checkbox" name="time" value="globo">Globo<br>
            <input type="checkbox" name="time" value="potiguar">Potiguar<br>
            <input type="checkbox" name="time" value="outro">Outro<br>
            <input type="submit">';
            } else {
                echo "Você respondeu ".$_COOKIE["voto"];
                echo "Obrigado pela participação!";
            }
        
            // put your code here
            ?>
            
            
        </form>
        <?php
        
        // put your code here
        ?>
    </body>
</html>
