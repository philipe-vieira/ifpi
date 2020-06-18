<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <meta charset="UTF-8">
        <title>QUESTÃO 2</title>
        <style>
            #tabelaP{
                border: solid;
                
            }
            #impar{
                background-color: green;
            }
            #par{
                background-color: yellow;
            }
            td {
                border: solid;
                border-color: blue;
            }
            


        </style>
    </head>
    <body>
        <center>
            <table id="tabelaP">
                <?php
                 echo '<tr>';
                  $i = 1;
                    for($i>0; $i<=10; $i++){
                        $multi = $i%3;
                        $imparpar = $i%2;
                        if($multi === 0){
                            if($imparpar === 1){

                                echo '<td id="impar">';
                                echo "$i";
                                echo '</td>';

                            }else {
                            
                                echo '<td id="par">';
                                echo "$i";
                                echo '</td>';
                            
                            }
                        }
                    }
                 echo '</tr>';
                ?>
            </table>
        </center>
    </body>
</html>
