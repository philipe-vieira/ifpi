<?php

$imc = $_POST["peso"] / ($_POST["altura"] * $_POST["altura"]);
echo "IMC: ".$imc;
 echo '<br> <br>';
if ($imc >= 25.0){
    echo "Usuário acima do peso.";
} elseif ($imc <= 20.0){
    echo "Usuário abaixo do peso.";
} else{
    echo "Usuário está saudável";
}