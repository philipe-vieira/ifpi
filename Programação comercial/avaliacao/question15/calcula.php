<?php

/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
$PERIMETRO = ($_POST["lado1"] + $_POST["lado2"]) * 2;
$AREA = $_POST["lado1"] * $_POST["lado2"];
ECHO "O PERIMETRO DO RETANGULO É: ".$PERIMETRO;
ECHO "METROS";
echo '<br> <br>';
ECHO "A AREA DO RETANGULO É: ".$AREA;
ECHO "METROS";
echo '<br> <br>';
