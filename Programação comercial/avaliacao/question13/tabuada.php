<?php

function tabuada($numer){
    echo "<table>";
    for($i = 0; $i <= 10; $i++){
        echo "<tr>";
        echo "<td>$numer</td>";
        echo "<td> + </td>";
        echo "<td>$i</td>";
        echo "<td> = </td>";
        /* @var $numer type */
        $resultado = $numer + $i;
        echo "<td>$resultado</td>";
        echo "</tr>";
    }
    echo "</table>";
}

/* @var $_GET type */
tabuada($_GET);