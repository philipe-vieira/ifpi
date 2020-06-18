<?php

$palavras = explode(" ", $_GET["nome"]);
echo '<br> <br>';
$quantidade = count($palavras)-1;
echo "olá ".$palavras[0]." ".$palavras[$quantidade];
