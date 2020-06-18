<?php

echo "FRASE:".$_GET["frase"];
$tamanho = strlen($_GET["frase"]);
echo '<br> <br>';
echo "TAMANHO DA FRASE: ".$tamanho;
$palavras = explode(" ", $_GET["frase"]);
echo '<br> <br>';
$quantidade = count($palavras);
echo "QUANTIDADE DE PALAVRAS: ".$quantidade;
echo '<br> <br>';
for($i = 0; $i < $quantidade; $i++){
    echo "TAMANHO DA PALAVRA ".$palavras[$i].": ".strlen($palavras[$i]);
    echo '<br> <br>';
}
/*$Tpalavra[] = strlen($palavras);
echo $Tpalavra;
foreach ($Tpalavra as $value) {
    //$value = strlen($palavras[$value]);
    
    echo $value;
    echo '<br> <br>';
    
}*/
