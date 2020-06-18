<?php

switch ($_POST["operacao"]){
    case "adicao":
        $redirect_page = 'http://localhost/avaliacao/question21/principal.php';
    
        $resultado = $_POST["1num"] + $_POST["2num"];
        $num1 = $_POST["1num"];
        $num2 = $_POST["2num"];
        header("Location: $redirect_page?num01=$num1&num02=$num2&resultado=$resultado");
        break;
    case "subtracao":
        $redirect_page = 'http://localhost/avaliacao/question21/principal.php';
    
        $resultado = $_POST["1num"] - $_POST["2num"];
        header("Location: $redirect_page?resultado=$resultado");
        break;
    case "multiplicacao":
        $redirect_page = 'http://localhost/avaliacao/question21/principal.php';
    
        $resultado = $_POST["1num"] * $_POST["2num"];
        header("Location: $redirect_page?resultado=$resultado");
        break;
    case "divisao":
        $redirect_page = 'http://localhost/avaliacao/question21/principal.php';
    
        $resultado = $_POST["1num"] / $_POST["2num"];
        header("Location: $redirect_page?resultado=$resultado");
        break;
    default :
        echo "Opção inválida!";
        break;
}