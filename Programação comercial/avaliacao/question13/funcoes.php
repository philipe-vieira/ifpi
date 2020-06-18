<?php

function tabuada($numer){
    echo "<table>";
    echo "<tr>";
    echo "<th>ADIÇÃO</th>";
     echo "<th>SUBTRAÇÃO</th>"; 
     echo "<th>MULTIPLICAÇÃO</th>";
    echo "<th>DIVISÃO</th>";
    echo "</tr>";
    
    for($i = 0; $i <= 10; $i++){
        echo "<tr>";
        $resultado = $numer + $i;
        echo "<td>$numer + $i = $resultado</td>";
        
        $resultado = $numer - $i;
        echo "<td>$numer - $i = $resultado</td>";
        
        $resultado = $numer * $i;
        echo "<td>$numer * $i = $resultado</td>";
        
        $resultado = $numer / $i;
        echo "<td>$numer / $i = $resultado</td>";
        echo "</tr>";
    }
    echo "</td>";
    echo "</tr>";
    echo "</table>";
}

$STRING = tabuada($_GET["numero"]);

header("Location: testafuncoes.php?tabuada=".$STRING);
