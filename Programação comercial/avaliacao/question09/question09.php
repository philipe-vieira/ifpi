<!DOCTYPE html>

<html>
<head>
    <meta charset="UTF-8">
    <title></title>
    <style>
        table{
            border-collapse: colapse;   
        }
        tr{
            border: 1px solid black;
        }
        td{
            border: 1px solid black;
        }
    </style>
</head>
<body>
<center>
    <!--<table>-->
    <?php
    echo '<table>';
    $cont = 1;
    do{
        echo "<tr><td>$cont</td></tr>";
        $cont++;
    }while ($cont <= 10);


    //for($i = 1; $i <= 10; $i++){
    //    echo "<tr>$i</tr>";
    //}
    echo '</table>';

    ?>
    <!--</table>-->
</body>
</html>
