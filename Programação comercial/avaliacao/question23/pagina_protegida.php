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

$cargo[] = "gerente";
$cargo[] = "vendedor";
$cargo[] = "diretor";
$cargo[] = "administrador";
$cargo[] = "vendedor";

$achou = FALSE;

for($i = 0;$i < 5; $i++){
    if($_POST["nome"] == $login[$i]){
        $achou = TRUE;
        if ($_POST["senha"] == $senha[$i]){
            echo "SEJA BEM VINDO(A) $login[$i], seu cargo é $cargo[$i].";
        }else{
            echo "SENHA INVÁLIDA!!!";
        }
    }
}
if ($achou == FALSE){
        echo "USUARIO NÃO CADASTRADO!";
    }