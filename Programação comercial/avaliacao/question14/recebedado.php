<?php

/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
$data = explode("-", $_GET["data"]);
$ano = $data[0];
$mes = $data[1];
$dia = $data[2];
echo "DATA DE NASCIMENTO:<br>";
echo "DIA: ".$dia."<br>";
echo "MES: ".$mes."<br>";
echo "ANO: ".$ano."<br><br>";
if ($ano == 2014) {
    echo "O USUARIO NASCEU NO ANO DE 2014<br>";
}elseif ($ano > 2014) {
    echo "Data invalida!!<br>";
    echo "Ano maior que 2014.";
}elseif ($ano < 2014) {
    $idade = 2014 - $ano;
    echo "o usuário tem $idade anos em 2014!!!";
}
