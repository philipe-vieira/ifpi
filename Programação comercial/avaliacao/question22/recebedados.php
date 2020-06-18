<?php


IF($_POST["idade"] >= 18 ){
    //global $_POST['nome'];
    echo $_POST['nome']." É MAIOR DE IDADE!";
    echo '<br> <br>';
    echo "NOME: ".$_POST["nome"];
    echo '<br> <br>';
    echo "ENDEREÇO: ".$_POST["endereco"];
    echo '<br> <br>';
    echo "SEXO: ".$_POST["sexo"];
    echo '<br> <br>';
    echo "";
} else {
    echo $_POST['nome']." É MENOR DE IDADE!";
}
