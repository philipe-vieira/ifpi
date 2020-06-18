<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <meta charset="UTF-8">
        <title>COISA SEM NADA</title>
    </head>
    <body>
        <center>    
        <h1>Meu guarda roupas</h1>
        <?php
        $gaveta = array("meia", "cueca", "camisas");
        for ($i = 0; $i < 3; $i++) {
            echo "nome da gaveta: '$gaveta[$i]' </br>";
        }
        $gaveta[2] = "boné";
        $gaveta[] = "sapato";
        $gaveta[] = "calção";
        ?>
        
        </br>
        </br>
        </br>
        </br>
        <h1>Pessoas legais</h1>
        <?php
        $boa = array("Rita", "Jessi(ela vende bombom)", "carla (ela não fala nada)");
        for ($i = 0; $i < 3; $i++) {
            echo "nome do individuo abencoado: '$boa[$i]' </br>";
        }
        ?>
        
        </br>
        </br>
        </br>
        </br>
        <h1>Pessoas não legais</h1>
        <?php
        $nada = array("phe", "luiz  (não sei pq né)", "david (só fala besteira)");
        $nada[] = "carla rejane ";
        $nada[] = "black eyed peas";
        for ($i = 0; $i < 5; $i++) {
            echo "nome do individuo: '$nada[$i]' </br>";
        }
        ?>
        
        </br>
        </br>
        </br>
        </br>
        <h1>Pessoas mais burras</h1>
        <?php
        $num = range(1,37,3);
        for ($i = 0; $i < 13; $i++){
            if ($num[$i] == 28) {
                $passou = $num[$i] + 2;
                echo "numero do individuo: '$passou' </br>";
            } else {
                echo "numero do individuo: '$num[$i]' </br>";
            }
        }
        
        ?>
        </center>  
    </body>
</html>
