<!DOCTYPE HTML>
<html>
<head>
<title>Título do documento</title>
</head>

<body>
<?php
echo "<center>";

switch ($_POST["questao"]) {
    case 1:
        echo "<form action='funcoes.php' method='GET'>";
        echo "<select name='numero'>";
            for($i = 1; $i <= 10; $i++){
               echo "<option value='".$i."'>".$i."</option>"; 
            }
        echo "</select>";

        echo '<input type= "submit" name="Confirmar">';
        echo '<br> <br>';
        echo "<textarea name='retorno' rows='25' cols='50' value='".(isset($_GET["tabuada"])?$_GET["tabuada"]:"")."'></textarea>";
        echo "</form>";
        break;

    default:
        echo "OPÇÃO INVÁLIDA";
        break;
}


echo "</center>";


?>
</body>

</html>



