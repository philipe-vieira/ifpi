<?php

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Description of Relogio
 *
 * @author phili
 */
class Relogio {
    //put your code here
    var $peso = "100g";
    var $marca = "Rolex";
    var $valor = 5000.00;

    
    function mostrarHora() {
        echo '<h3>Hora.</h3>';
        $format  = "H:i:s";
        echo date($format);
        
        echo "<br><br><b>Caracteristicas</b> ";
        echo "<br>peso: ". $this->peso;
        echo "<br>marca: ".$this->marca;
        echo "<br>valor: ".$this->valor;
    }
    function ajustarHora() {
        echo '<h3>Hora ajustada:  </h3>';
        $format1  = "H";
        $format2  = "i";
        $format3  = "s";
        echo "Hora: ".date($format1);
        echo "<br>Minutos: ".date($format2);
        echo "<br>Segundos: ".date($format3);
        
        echo "<br><br><b>Caracteristicas</b> ";
        echo "<br>peso: ". $this->peso;
        echo "<br>marca: ".$this->marca;
        echo "<br>valor: ".$this->valor;
        
    }

}
