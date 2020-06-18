<!DOCTYPE html>

<html>
<head>
    <meta charset="UTF-8">
    <title></title>
    <style>
        table{
            border-collapse: colapse;
            border: 3px ridge red;
        }
        table tr{
            border: 1px solid black;
        }
        table td{
            border: 1px solid black;
        }
    </style>
</head>
<body>
<center>
    <?php
    echo '<table><tr>';
    for($i = 1; $i <= 100; $i++){
        if($i % 3 == 0){
            if($i % 2 == 0){
                echo "<td style='background-color: green'>$i</td>";
            }else{
                echo "<td style='background-color: yellow'>$i</td>";
            }
        }
    }
    echo '</tr></table>';

    ?>
</center>
</body>
</html>
