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
        <style>
            #domingo{
                background-color: lightskyblue;
                border: solid;
                border-color: lightskyblue;
            }
        </style>
    </head>
    <body>
        <table>
        <tr>
          <th>Domingo</th>
          <th>Segunda</th>
          <th>Terça</th>
          <th>Quarta</th>
          <th>quinta</th>
          <th>Sexta</th>
          <th>Sábado</th>
        </tr>
        <tr></tr>
        <tr></tr>

        <?php
        $i = 1;
        for($i=1; $i<=31; $i++){
            $dia = $i%7;
            if($dia === 1){
                echo '<tr>';
                    echo '<td id ="domingo">';
                    echo "$i";
                    echo '</td>';
                
                    }
            else {
                echo '<td>';
                echo "$i";
                echo '</td>';
            }
        }
        ?>
        </table>
    </body>
</html>
