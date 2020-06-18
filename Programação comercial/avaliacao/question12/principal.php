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
            img{
                width: 124px;
                height: 128px;
            }
        </style>
           
    </head>
    <body>
        <table>
            <?php
             $i = 1;
                for($i = 1; $i<=10;$i++){
                    if($i % 5 == 1){
                        echo '<tr><td>';
                            echo "<img src= 'foto$i.jpg' alt='img'.$i.'nova' >";
                        echo '</td>';
                    }elseif ($i % 5 == 0) {
                        echo '<td>';
                            echo "<img src= 'foto$i.jpg' alt='img'.$i.'nova' >";
                        echo '</td></tr>';
                    }else {
                        echo '<td>';
                            echo "<img src= 'foto$i.jpg' alt='img'.$i.'nova' >";
                        echo '</td>';
                    }
                
                }
            ?>
        </table>
    </body>
</html>
