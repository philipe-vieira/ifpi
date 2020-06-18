<?php
session_start();
if(!isset($_SESSION["usuario"]) && !isset($_SESSION["autenticado"])){
    unset($_SESSION["autenticado"]);
    unset($_SESSION["usuario"]);
}

header("Location: http://localhost/avaliacao/question33/principal.php");