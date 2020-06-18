<?php

session_start();
$textotarefa = $_POST["tarefa"];
if(!isset($_SESSION["taferas"])){
    $tarefas = array();
}else{
    $tarefas = $_SESSION["tarefas"];
}
$tarefa[0] = $textotarefa;
array_push($tarefas, $tarefa);
$_SESSION["tarefas"] = $tarefas;
header("Location: http://localhost/avaliacao/question33/arearestrita.php");