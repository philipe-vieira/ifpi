<?php

/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
echo "TABUADA";
ECHO "<br><br>";

for($i = 0; $i <= 10; $i++){
    echo $_GET["numero"];
    echo " * ";
    echo "$i";
    echo " = ";
    $resultado = $_GET["numero"] * $i;
    echo "$resultado";
    echo "<br>";
}
