<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <meta charset="UTF-8">
        <title></title>
    </head>
    <body>
        <form action="recuperadados.php" method="POST">
            <fieldset>
            <label>Nome (opcional): </label>
            <input type="text" name="nome"><br>
            <label>Idade: </label>
            <select name="idade" required>
                <?php
                for($i = 1; $i <= 60; $i++){
                    echo "<option value='$i'>$i</option>";
                }
                ?>
            </select><br><br>
            <label>Naturalidade: </label>
            <input type="text" name="naturalidade" required><br><br>
            <label>Nacionalidade: </label>
            <input type="text" name="nacionalidade" required><br><br>
            <label>Votou na eleição anterior para prefeito?</label><br>
            <input type="radio" value="sim" name="voto" required>sim
            <input type="radio" value="não" name="voto" required>não<br><br>
            <label>Marque os partidos que você mais se identifica: </label><br>
            <input type="checkbox" name="partido[]" value="PT">PT
            <input type="checkbox" name="partido[]" value="PSDB">PSDB
            <input type="checkbox" name="partido[]" value="Democratas">Democratas
            <input type="checkbox" name="partido[]" value="PSTU">PSTU
            <input type="checkbox" name="partido[]" value="Outro">Outro<br><br>
            <label>Como você classifica a administração atual?</label><br>
            <input type="radio" value="otima" name="classificacao" required>Ótima
            <input type="radio" value="boa" name="classificacao" required>Boa
            <input type="radio" value="regular" name="classificacao" required>Regular
            <input type="radio" value="pessima" name="classificacao" required>Péssima<br><br>
            <label>Quais os principais problemas da cidade atualmente?</label><br>
            <textarea name="problemas" rows="4" cols="20">Digite aqui...</textarea>
            <input type="submit">
            </fieldset>
        </form>
        
    </body>
</html>
   