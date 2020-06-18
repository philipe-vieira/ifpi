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
        <table>
            <?php
             $i = 1;
                for($i = 1; $i<=10;$i++){
                    echo '<td>';
                        echo "<img src= 'foto$i.jpg' alt='img'.$i.'nova' style='width:304px;height:228px;'>";
                    echo '</td>';
                }   
            ?>
        </table>
    </body>
</html>
