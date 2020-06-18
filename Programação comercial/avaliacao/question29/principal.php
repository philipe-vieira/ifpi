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
        function data(){
           $recebe  = date("d-M-Y");
           $recebe = str_replace("-", " de ", $recebe);
        echo date("l").", ".$recebe;
        //echo '<br>';
        //echo date("D, d \de M \de Y");
        }
        data();
        // put your code here
        ?>
    </body>
</html>
