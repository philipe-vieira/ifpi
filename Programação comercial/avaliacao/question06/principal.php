<?php
$nomes = "joao,maria,renata,amos";
$separados = explode(",", $nomes);

echo "inicio: ".$nomes;

natsort($separados);
echo '<br> <br>';
print_r($separados);
for ($i = 0; $i < 4; $i++){
echo '<br> <br>';
echo "Separando...   ".$separados[$i];

}
echo '<br> <br>';
echo '<br> <br>';
echo "Separados com sucesso";
?>