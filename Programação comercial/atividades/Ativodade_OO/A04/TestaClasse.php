<?php

include_once 'Porta.php';
$porta = new Porta();
$estado;

if (!isset($_GET["alter"])) {
    $opt[0] = "abrir";
    $opt[1] = "fechar";
    $opt[2] = "pintar";
    $opt[3] = "alterar";
    $opt[4] = "verificar";
    switch ($_POST["escolha"]) {
//        ABRE
        case $opt[0]:
            echo $porta->abre();
            
            echo '<a href="Principio.php">Voltar.</a>';
            break;
//        FECHA
        case $opt[1]:
            $porta->fechar();
            
            echo '<a href="Principio.php">Voltar.</a>';
            break;
//        PINTA A PORTA.
        case $opt[2]:
            if (!isset($_POST["cor"])) {
                $porta->pinta($_POST["cor"]);
                echo '<a href="Principio.php">Voltar.</a>';
            } else {
                header("Location: formCor.html");
            }
            break;
//            ALTERA AS DIMENSOES DA PORTA
        case $opt[3]:
            if (!isset($_POST["dimensaox"]) && !isset($_POST["dimensaoy"]) && !isset($_POST["dimensaoz"])) {
                $porta->setDimensaoX($_POST["dimensaox"]);
                $porta->setDimensaoY($_POST["dimensaoy"]);
                $porta->setDimensaoZ($_POST["dimensaoz"]);
                echo '<a href="Principio.php">Voltar.</a>';
            } else {
                header("Location: formDimensao.html");
            }
            
            break;
//            VERIFICA SE A PORTA ESTÁ ABERTA
        case $opt[4]:
            echo $porta->estaAberta();
            $estado=1;
            echo '<a href="Principio.php">Voltar.</a>';
            break;
        default:
            header("Location: formAtualiza.html?");
            break;
    }
} elseif (!isset($_GET["constroi"])) {
    if (!isset($_POST["posicao"]) &&
            !isset($_POST["cor"]) &&
            !isset($_POST["dimensaox"]) &&
            !isset($_POST["dimensaoy"]) &&
            !isset($_POST["dimensaoz"])) {
        
        $porta->setAberta($_POST["posicao"]);
        $porta->setCor($_POST["cor"]);
        $porta->setDimensaoX($_POST["dimensaox"]);
        $porta->setDimensaoY($_POST["dimensaoy"]);
        $porta->setDimensaoZ($_POST["dimensaoz"]); 
        
        header("Location: Principio.php");
    } else {
        header("Location: formConstruct.html");
    }
}
//if ($porta->getDimensaoX() == NULL ||
//        $porta->getDimensaoY() == NULL ||
//        $porta->getDimensaoZ() == NULL || 
//        $porta->getCor() == NULL ) {
//    $estado=0;
//    header("Location: Principio.php?estado=$estado");
//}
