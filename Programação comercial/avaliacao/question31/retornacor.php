<?php

/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

setcookie("cor", $_POST["cor"], time() + 30);
//$valorcor = $_COOKIE["cor"];
//$volta = "http://localhost/avaliacao/question31/principal.php";
header('Location: http://localhost/avaliacao/question31/principal.php?cor='.$_COOKIE["cor"].'');