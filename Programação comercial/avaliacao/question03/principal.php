<?php
$frase = "Já estudei java antes.";
$complemento = "java e php";

echo "frase inicial: ".$frase;
echo '<br> <br>';
$saida = str_replace("java", $complemento, $frase);
echo "frase final: ".$saida;

?>