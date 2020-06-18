<?php

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Description of Pessoa
 *
 * @author philipe
 */
class Pessoa {
    //put your code here
    private $nome;
    private $sexo;
    private $idade;
    
//    Get's e Set's de Nome    
    public function getNome() {
        return $this->nome;
    }
    public function setNome($Nome) {
        $this->nome = $Nome;
    }
//    Get's e Set's de Sexo
    public function getSexo() {
        return $this->sexo;
    }
    public function setSexo($Sexo) {
        $this->sexo = $Sexo;
    }        
//    Get's e Set's de Idade
    public function getIdade() {
        return $this->idade;
    }
    public function setIdade($Idade) {
        $this->idade = $Idade;
    }
    
    function __construct($nome, $sexo, $idade) {
        $this->setNome($nome);
        $this->setSexo($sexo);
        $this->setIdade($idade);
    }
    function aniversaria() {
        $this->setIdade($this->getIdade() + 1);
        echo '<br>';
        return $this->getIdade();
    }
    
}
