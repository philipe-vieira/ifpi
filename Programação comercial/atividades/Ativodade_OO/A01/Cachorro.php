<?php

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Description of Cachorro
 *
 * @author phili
 */
class Cachorro {
    //put your code here
    var $nome = "Toto";
    var $idade = "6 meses";
    var $raca = "Pinscher";
    
    
    function latir() {
        echo '<h3>'.$this->nome.' latindo:           </h3>';
        echo "Au au.";
        
        echo "<br><br><b>Caracteristicas</b> ";
        echo "<br>idade: ". $this->idade;
        echo "<br>Raça: ".$this->raca;
    }
    function brincar() {
        echo '<h3>'.$this->nome.' brincando:          </h3>';
        echo "Au au au au.";
        
        echo "<br><br><b>Caracteristicas</b>";
        echo "<br>idade: ". $this->idade;
        echo "<br>Raça: ".$this->raca;
    }
}
