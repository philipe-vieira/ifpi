<?php

echo "<center>";
echo "<form action='tabuada.php' method='GET'>";
echo "<select>";
for($i = 1; $i <= 10; $i++){
   echo "<option value='".$i."'>".$i."</option>"; 
}
echo "</select>";
echo '<input type= "submit" name="Confirmar">';
echo "</form>";
echo "</center>";


