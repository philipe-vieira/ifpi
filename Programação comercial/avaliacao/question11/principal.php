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
            table{
                border-collapse: colapse;
            }
            td{
                boder: 2px ; 
            }
            td.semana{
                background-color: yellowgreen;
            }
        </style>
    </head>
    <body>
        <table>
            <tr>
                <td class="semana">D</td>
                <td class="semana">S</td>
                <td class="semana">T</td>
                <td class="semana">Q</td>
                <td class="semana">Q</td>
                <td class="semana">S</td>
                <td class="semana">S</td>
            </tr>
        <?php
        for($i = 1; $i <= 30; $i++){
            if ($i % 7 == 1){
                echo "<tr><td>$i</td>";
            } else if ($i % 7 == 0){
                echo "<td>$i</td></tr>";
            }
            else {
                echo "<td>$i</td>";
            }
        }
        
        ?>
        </table>
    </body>
</html>
