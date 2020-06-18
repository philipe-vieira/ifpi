<?php
$nomes = "joao,maria,renata";
$separados = explode(",", $nomes);
echo "inicio: ".$nomes;
for ($i = 0; $i < 3; $i++){
echo '<br> <br>';
echo "Separando...   ".$separados[$i];

}
echo '<br> <br>';
echo '<br> <br>';
echo "Separados com sucesso";
?>