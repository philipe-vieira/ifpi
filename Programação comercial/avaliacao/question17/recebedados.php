<?php

/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
if($_GET["nome"] == "Maria" or $_GET["nome"] == "maria" or $_GET["nome"] == "MARIA"){
    if ($_GET["senha"] == 12345){
        echo "Autenticação realizada com sucesso!";
    } else {
        echo "Senha inválida.";
    }
} else {
    echo "Usuário não cadastrado.";
}
