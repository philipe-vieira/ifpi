<?php

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Description of Porta
 *
 * @author phili
 */
class Porta {
    private $aberta;
    private $cor;
    private $dimensaoX;
    private $dimensaoY;
    private $dimensaoZ;
    
    public function getAberta() {
        return $this->aberta;
    }
    public function getCor() {
        return $this->cor;
    }
    public function getDimensaoX() {
        return $this->dimensaoX;
    }
    public function getDimensaoY() {
        return $this->dimensaoY;
    }
    public function getDimensaoZ() {
        return $this->dimensaoZ;
    }
    public function setAberta($aberta) {
        $this->aberta = $aberta;
    }
    public function setCor($cor) {
        $this->cor = $cor;
    }
    public function setDimensaoX($dimensaoX) {
        $this->dimensaoX = $dimensaoX;
        echo "Nova dimensão X: ".$dimensaoX."<br>";
    }
    public function setDimensaoY($dimensaoY) {
        $this->dimensaoY = $dimensaoY;
        echo "Nova dimensão Y: ".$dimensaoY."<br>";
    }
    public function setDimensaoZ($dimensaoZ) {
        $this->dimensaoZ = $dimensaoZ;
        echo "Nova dimensão Z: ".$dimensaoZ."<br>";
    }

    public function abre() {
        $this->setAberta("aberta");
        echo "Porta aberta com sucesso.<br>";
        
    }
    public function fechar() {
        $this->setAberta("fechada");
        echo "Porta fechada com sucesso.<br>";
    }
    public function estaAberta() {
        if($this->getAberta() == "aberta"){
            echo "<b>A porta está aberta.<br>";
            echo "Entrada permitida.</b><br>";
        }elseif ($this->getAberta() == "fechada") {
            echo "<b>A porta está fechada.<br>";
            echo "Entrada proibida.</b><br>";
        } else {
            echo "Não cadastrado!";
        }
    }
    public function pinta($cor) {
        $this->setCor($cor);
        echo "Nova cor: ".$cor."<br>";
        
    }
    
}
