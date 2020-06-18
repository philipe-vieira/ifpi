<?php

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Description of Relogio
 *
 * @author philipe
 */
class Relogio {
    //put your code here
    private $peso;
    private $marca;
    private $valor;
//    Get's e Set's de Peso    
    public function getPeso() {
        return $this->peso;
    }
    public function setPeso($peso) {
        $this->peso = $peso;
    }
//    Get's e Set's de Marca
    public function getMarca() {
        return $this->marca;
    }
    public function setMarca($Marca) {
        $this->marca = $Marca;
    }
//    Get's e Set's de Valor
    public function getValor() {
        return $this->valor;
    }
    public function setValor($Valor) {
        $this->valor = $Valor;
    }

    
    function mostrarHora($peso , $marca, $valor) {
        if($this->peso == NULL || $this->marca == NULL || $this->valor == NULL){
            $this->setMarca($marca);
            $this->setPeso($peso);
            $this->setValor($valor);
        }
        
        echo '<h3>Hora.</h3>';
        $format  = "H:i:s";
        echo date($format);
        
        echo "<br><br><b>Caracteristicas</b> ";
        echo "<br>peso: ". $this->getPeso();
        echo "<br>marca: ".$this->getMarca();
        echo "<br>valor: ".$this->getValor();
        
    }
    function ajustarHora($peso , $marca, $valor) {
        if($this->peso == NULL || $this->marca == NULL || $this->valor == NULL){
            $this->setMarca($marca);
            $this->setPeso($peso);
            $this->setValor($valor);
        }
        
        echo '<h3>Hora ajustada:  </h3>';
        $format1  = "H";
        $format2  = "i";
        $format3  = "s";
        echo "Hora: ".date($format1);
        echo "<br>Minutos: ".date($format2);
        echo "<br>Segundos: ".date($format3);
        
        echo "<br><br><b>Caracteristicas</b> ";
        echo "<br>peso: ". $this->getPeso();
        echo "<br>marca: ".$this->getMarca();
        echo "<br>valor: ".$this->getValor();
//        return $format1;
        
    }

}
