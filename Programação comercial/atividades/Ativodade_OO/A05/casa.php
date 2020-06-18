<?php

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Description of casa
 *
 * @author phili
 */
class casa{
    private $cor;
    var $Porta, $porta1, $porta2, $porta3;

public function getCor() {
return $this->cor;
}

public function setCor($cor) {
$this->cor = $cor;
}
public function InstanciaPorta() {
    $this->Porta = new Porta();
    $this->porta1 = new Porta();
    $this->porta2 = new Porta();
    $this->porta3 = new Porta();
}
    
}



