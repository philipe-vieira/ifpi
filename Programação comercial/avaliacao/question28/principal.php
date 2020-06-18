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
        <?php
        function cumprimenta($data){
            if($data >= 05 && $data < 13){
                echo "Bom dia!";
            }elseif ($data >= 13 && $data < 18) {
                 echo "Bom tarde!";
            } else {
                echo "Boa noite!";
            }
        }




        echo "Data: ".date("d:n:Y");
        echo '<br>';
        echo "Hora: ".date("H:i:s");
        echo '<br>';
        echo '<br>';
        cumprimenta(date("H"));
        //if
        // put your code here
        ?>
    </body>
</html>
