<?php

/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
$senhav = $_POST["senha"];
$csenhav = $_POST["csenha"];

if ($senhav == $csenhav){
    session_start();
    $_SESSION["usuario"] = $_POST["nome"];
    $verifica = true;
    header("Location: http://localhost/avaliacao/question32/cadastro.php?verifica=$verifica");
} else{
    $verifica = false;
    $nome = $_POST["nome"];
    $sexo = $_POST["sexo"];
    $cidade = $_POST["cidade"];
    $login = $_POST["login"];
    header("Location: http://localhost/avaliacao/question32/cadastro.php?verifica=$verifica&nome=$nome&sexo=$sexo&cidade=$cidade&login=$login&senha=$senhav&csenha=$csenhav");
}
