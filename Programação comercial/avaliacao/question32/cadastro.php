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
        <form action="recebecadastro.php" method="POST">
            <h3>Digite seu dados</h3>
            
            <p>
                <?php
                
                // put your code here
                if (isset($_GET["verifica"])){
                    if ($_GET["verifica"] == true) {
                        echo "Dados cadastrados com sucesso!";
                    } else {
                      echo "As senhas não conferem.";
                    }
                }
                
    
                
                ?>
            </p>
            
            <label>Nome: </label><br>
            <input type="text" name="nome" value="<?php echo (isset($_GET["nome"])?$_GET["nome"]:"");  ?>"><br>
            <label>Sexo: </label>
            <input type="radio" name="sexo" value="m" <?php echo (isset($_GET["sexo"])?($_GET["sexo"] == "m"):"") ? "checked" : null;  ?>/>Masculino
            <input type="radio" name="sexo" value="f" <?php echo (isset($_GET["sexo"])?($_GET["sexo"] == "f"):"") ? "checked" : null; ?>/>Feminino<br>
            <label>Cidade: </label>
            <select name="cidade" >
                <option value="teresina"<?php echo (isset($_GET["cidade"])?($_GET["cidade"] == "teresina"):"") ? "checked" : null;  ?>>teresina</option>
                <option value="timon"   <?php echo (isset($_GET["cidade"])?($_GET["cidade"] == "timon"):"") ? "checked" : null;  ?>>timon</option>
                <option value="sao luis"<?php echo (isset($_GET["cidade"])?($_GET["cidade"] == "sao luis"):"") ? "checked" : null;  ?>>sao luis</option>
                <option value="parnaiba"<?php echo (isset($_GET["cidade"])?($_GET["cidade"] == "parnaiba"):"") ? "checked" : null;  ?>>parnaiba</option>
            </select><br>
            <label>Login: </label><br>
            <input type="text" name="login" value="<?php echo (isset($_GET["login"])?$_GET["login"]:"");  ?>"><br>
            <label>Senha: </label><br>
            <input type="password" name="senha" value="<?php echo (isset($_GET["senha"])?$_GET["senha"]:"");  ?>"><br>
            <label>Comfirmar Senha: </label><br>
            <input type="password" name="csenha" value="<?php echo (isset($_GET["csenha"])?$_GET["csenha"]:"");  ?>"><br>
            <input type="submit" value="cadastrar">
        </form>
        <?php
        // put your code here
        ?>
    </body>
</html>
