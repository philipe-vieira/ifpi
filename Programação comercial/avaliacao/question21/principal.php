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
        <form action="opera.php" method="POST">
            <label>1° numero</label>
            <input type="text" name="1num" value="<?php echo (isset($_GET["num01"])?$_GET["num01"]:"");  ?>"><br>
            <label>2° numero</label>
            <input type="text" name="2num" value="<?php echo (isset($_GET["num02"])?$_GET["num02"]:"");  ?>"><br>
            <label>operação</label>
            <select name="operacao">
                <option value="adicao">adição</option>
                <option value="subtracao">subtração</option>
                <option value="multiplicacao">multiplicação</option>
                <option value="divisao">divisão</option>
            </select><br>
            <input type="submit"><br><br>
            <label>resultado</label>
            <input value="<?php echo (isset($_GET["resultado"])?$_GET["resultado"]:"");  ?>"><br>
        </form>
        <?php
        // put your code here
        ?>
    </body>
</html>
