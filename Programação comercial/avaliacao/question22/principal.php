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
        <form action="recebedados.php" method="POST">
            <table>
                <tr><td><label>Nome: </label></td>
                <td><input type="text" name="nome" required></td></tr> 
                
                <tr><td><label>Endereço: </label></td>
                <td><input type="text" name="endereco" ></td></tr>
                
                <tr><td><label>Idade: </label></td>
                    <td><input type="text" name="idade" required></td></tr>
                
                <tr><td><label>Sexo: </label></td>
            <td><input type="radio" name="sexo" value="Masculino">Masculino
            <input type="radio" name="sexo" value="Feminino">Feminino</td></tr>
            <tr><td><input type="submit"></td></tr>
            </table>
            
        </form>
        <?php
        // put your code here
        ?>
    </body>
</html>
