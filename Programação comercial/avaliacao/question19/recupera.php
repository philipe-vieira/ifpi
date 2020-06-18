<?php

/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//$array[] = sort($_GET);
//echo '<br> <br>';
foreach ($_GET as $value) {
    $array[] = $value;
}
echo 'FRASE: ';
foreach ($array as $value) {
    echo $value;
    echo ' ';
}
echo '<br> <br>';
echo 'PALAVRAS EM ORDEM ALFABETICA: ';
$array[] = sort($array);
foreach ($array as $value) {
    echo $value;
    echo ' ';
}
/*for($i = 0; $i <= 10; $i++){
    echo "$array[$i]";
    echo "<br>";
}*/