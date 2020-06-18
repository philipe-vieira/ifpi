<!DOCTYPE HTML>
<html>
<head>
<title>Título do documento</title>
</head>

<body>
<?php

echo "<center>";
echo "<form action='testafuncoes.php' method='POST'>";

echo "<select name='questao'>";
   echo "<option value='1'>QUESTÃO 1</option>"; 
   echo "<option value='2'>QUESTÃO 2</option>";
   echo "<option value='3'>QUESTÃO 3</option>";
echo "</select>";
echo '<br> <br>';
echo '<input type= "submit" name="Confirmar">';
echo "</form>";
echo "</center>";

?>
</body>

</html>
