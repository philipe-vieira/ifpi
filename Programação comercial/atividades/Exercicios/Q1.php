<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <meta charset="UTF-8">
        <title>QUESTÃO 1</title>
        <style>
            #tabelaP{
                border: solid;
                border-bottom-style: solid;
                
            }
            tr{
                border-top: solid;
            }
            
            


        </style>
    </head>
    <body>
        <center>
            <table id="tabelaP">
                <?php
                  $i = 1;
                    for($i>0; $i<=10; $i++){
                    echo '<tr>';
                        echo '<td id="impar">';
                            echo "$i";
                        echo '</td>';
                    echo '</tr>';   
                    }
                ?>
            </table>
        </center>
    </body>
</html>
