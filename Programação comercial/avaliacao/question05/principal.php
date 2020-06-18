<?php
$frase = "O PHP foi criado em noventa e cinco";

ECHO "FRASE: \"O PHP foi criado em noventa e cinco\" ";
echo '<br> <br>';
echo '<br> <br>';
$str = str_replace("o", "0", $frase);
$str = str_replace("a", "4", $str);
$str = str_replace("i", "1", $str);


echo "FRASE: ".$str;
?>