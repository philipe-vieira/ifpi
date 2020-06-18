<?php

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Description of Cachorro
 *
 * @author philipe
 */
class Cachorro {
    //put your code here
    private $nome;
    private $idade;
    private $raca;
//    Get's e Set's de Nome    
    public function getNome() {
        return $this->nome;
    }
    public function setNome($Nome) {
        $this->nome = $Nome;
    }
//    Get's e Set's de Idade
    public function getIdade() {
        return $this->idade;
    }
    public function setIdade($Idade) {
        $this->idade = $Idade;
    }
//    Get's e Set's de Raca
    public function getRaca() {
        return $this->raca;
    }
    public function setRaca($Raca) {
        $this->raca = $Raca;
    }    
    
    function latir($nome, $idade, $raca) {
        if($this->nome == NULL || $this->idade == NULL || $this->raca == NULL){
            $this->setNome($nome);
            $this->setIdade($idade);
            $this->setRaca($raca);
        }
        echo '<h3>'.$this->getNome().' latindo:           </h3>';
        echo "Au au.";
        
        echo "<br><br><b>Caracteristicas</b> ";
        echo "<br>idade: ". $this->getIdade();
        echo "<br>Raça: ".$this->getRaca();
    }
    function brincar($nome, $idade, $raca) {
        if($this->nome == NULL || $this->idade == NULL || $this->raca == NULL){
            $this->setNome($nome);
            $this->setIdade($idade);
            $this->setRaca($raca);
        }
        echo '<h3>'.$this->getNome().' brincando:          </h3>';
        echo "Au au au au.";
        
        echo "<br><br><b>Caracteristicas</b>";
        echo "<br>idade: ". $this->getIdade();
        echo "<br>Raça: ".$this->getRaca();
    }
}
