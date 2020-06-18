<!doctype html>
<html>
<head>
<meta charset="utf-8">
<title>PRIMEIRO SITE</title>
<style type="text/css">
    th{
        align-content: center;
        border: 1px solid black;
    }
    tr {
         border: 1px solid black;
    }
    td{
        border: 1px solid black;
    }
    table {
        align-items: center;
        align-self: center;
        align-content: center;
        width: 50%;
        background-color: background;
        border: 3px solid black;
    }
h2 {
	font-size: larger;
}
</style>
</head>

<body>
<h1 class="001"><em><strong>Bom dia mundo</strong></em><br>
</h1>
<h2><em> fala galera.!!! </em></h2>
<?php
    //declaração de variavel.
    $nota1 = 7.5;
    $nota2 = 8.6;
    $nota3 = 9.0;
    $nota4 = 4.5;
    $media = ($nota1 + $nota2 + $nota3 + $nota4)/2;

    $nomeA = "Chico";
    $disc = "PC";
    $CargH = "80h";
    $faltas = 6;
        echo "<center><table>";
        echo "<tr><center><h3>Notas Bimestrais</h3></center></tr>";
        echo "<tr>"
        . "<td><center><b>Bimestres</b></center></td>"
        . "<td><center><b>Notas</b></   center></td>"
                . "</tr>";
        echo "<tr>"
        . "<td>B1: </td>"
        . "<td>$nota1</td>"
                . "</tr>";
        echo "<tr>"
        . "<td>B2: </td>"
        . "<td>$nota2</td>"
                . "</tr>";
        echo "<tr>"
        . "<td>B3: </td>"
        . "<td>$nota3</td>"
                . "</tr>";
        echo "<tr>"
        . "<td>B4: </td>"
        . "<td>$nota4</td>"
                . "</tr>";
        echo "</table></center>";

?> 
</body>
</html>