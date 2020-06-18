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
        <?php
        include_once './Porta.php';
        $portao = new Porta();
        
        $portao->abre();
        $portao->estaAberta();
        $portao->fechar();
        $portao->estaAberta();
        $portao->abre();
        $portao->estaAberta();
        $portao->fechar();
        $portao->abre();
        $portao->fechar();
        $portao->estaAberta();
        $portao->abre();
        echo "<br><br><br>";
        
        $portao->pinta("azul");
        $portao->pinta("verde");
        $portao->pinta("vermelho");
        $portao->pinta("dark");
        echo '<br><br><br>';
        
        $portao->setDimensaoX(34);
        $portao->setDimensaoY("12");
        $portao->setDimensaoZ("58");
        echo "<br><br><br>";
        
        $portao->setDimensaoX("34");
        $portao->setDimensaoY("12");
        $portao->setDimensaoZ("58");
        echo '<br><br><br>';
        
        $portao->setDimensaoX("34");
        $portao->setDimensaoY("12");
        $portao->setDimensaoZ("58");
        echo "<br><br><br>";
        ?>
    </body>
</html>
