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
        <style>
            h1{
                font-style: <?php echo (isset($_GET["italico11"])?$_GET["italico11"]:"");  ?>;
                font-weight: <?php echo (isset($_GET["negrito11"])?$_GET["negrito11"]:"");  ?>;
                text-decoration: <?php echo (isset($_GET["sublinhado11"])?$_GET["sublinhado11"]:"");  ?>;
                text-align: <?php echo (isset($_GET["alinhamento11"])?$_GET["alinhamento11"]:"");  ?>;
                color: <?php echo (isset($_GET["cor11"])?$_GET["cor11"]:"");  ?>;
                font-size: <?php echo (isset($_GET["tamanho11"])?$_GET["tamanho11"]:"");  ?>;
            }
        </style>
    </head>
    <body>
        <form action="retornaurl.php" method="POST" >
            <label>Digite o texto: </label>
            <input type="text" name="texto" required><br>
            <input type="checkbox" name="italico" value="italic">italico
            <input type="checkbox" name="negrito" value="bold">negrito
            <input type="checkbox" name="sublinhado" value="underline">sublinhado<br>
            <select name="alinhamento">
                <option value="left">Left</option>
                <option value="center">Center</option>
                <option value="right">Rigth</option>
            </select><br>
            
            <select name="cor">
                <option value="red">Vermelho</option>
                <option value="blue">Azul</option>
                <option value="yellow">Amarelo</option>
            </select><br>
            <label>Quantia de repetições: </label>
            <input type="text" name="repeticoes" required><br>
            <select name="tamanho">
                <option value="8px">8 px</option>
                <option value="10px">10 px</option>
                <option value="12px">12 px</option>
            </select>
            <input type="submit">
            <h1><?php 
                $repete = (isset($_GET["repeticoes11"])?$_GET["repeticoes11"]:"");
                for($i = 1; $i <= $repete; $i++){
                    echo (isset($_GET["texto11"])?$_GET["texto11"]:"");
                }
              ?></h1>
            
        </form>
        <?php
        
        ?>
    </body>
</html>
