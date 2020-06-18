<?php

/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

$login = array("maria","ana","joao","francisco","jose");

$senha[] = "123";
$senha[] = "1234";
$senha[] = "12345";
$senha[] = "123456";
$senha[] = "1234567";

$senhaver = $_POST["senha"];
$loginver = $_POST["usuario"];
$achou = FALSE;
//for($i = 0; $i < 5; $i++){
    if ($loginver === "joao" && $senhaver === "12345"){
        session_start();
        $achou = TRUE;
        $_SESSION["usuario"] = $_POST["nome"];
        $_SESSION["autenticado"] = true;
        header("Location: http://localhost/avaliacao/question33/arearestrita.php?");
    }
//}
 if ($achou == TRUE){
    header("Location: http://localhost/avaliacao/question33/arearestrita.php?");
} else {
    header("Location: http://localhost/avaliacao/question33/principal.php?erro=1");
}