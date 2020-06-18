<?php

/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
$TEXTO = $_POST["texto"];
if ($_POST["italico"]  == "italic") {
    $italico = $_POST["italico"];
} else {
    $italico = "";
}

if ($_POST["negrito"]  == "bold") {
    $negrito = $_POST["negrito"];
} else {
    $negrito = "";
}

if ($_POST["sublinhado"]  == "underline") {
    $sublinhado = $_POST["sublinhado"];
} else {
    $sublinhado = "";
}

$alinhamento = $_POST["alinhamento"];
$cor = $_POST["cor"];
$repeticoes = $_POST["repeticoes"];
$tamanho = $_POST["tamanho"];
$URL = "http://localhost/avaliacao/question26/principal.php";
header("Location: $URL?texto11=$TEXTO&italico11=$italico&negrito11=$negrito&sublinhado11=$sublinhado&alinhamento11=$alinhamento&cor11=$cor&tamanho11=$tamanho&repeticoes11=$repeticoes");


