<?php

echo "NOME: ".$_POST["nome"];
echo '<br> <br>';
echo "IDADE: ".$_POST["idade"];
echo '<br> <br>';
echo "NATURALIDADE: ".$_POST["naturalidade"];
echo '<br> <br>';
echo "NACIONALIDADE: ".$_POST["nacionalidade"];
echo '<br> <br>';
echo "VOTO NA ELEIÇÃO: ".$_POST["voto"];
echo '<br> <br>';
foreach ($_POST["partido"] as $value) {
    echo "Partido(s): ".$value;
}
echo '<br> <br>';
echo "CLASSIFICAÇÃO: ".$_POST["classificacao"];
echo '<br> <br>';
IF ($_POST["problemas"] != null){
    echo "PROBLEMAS: ".$_POST["problemas"];
}
echo '<br> <br>';