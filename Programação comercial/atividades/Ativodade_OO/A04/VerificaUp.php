<?php

if (isset($_POST["escolha"])) {
        $opt[0] = "abrir";
        $opt[1] = "fechar";
        $opt[2] = "pintar";
        $opt[3] = "alterar";
        $opt[4] = "verificar";
    switch ($_POST["escolha"]) {
        case $opt[0]:
            header("Location: TestaClasse.php?alter=$opt[0]");
            break;
        case $opt[1]:
            header("Location: TestaClasse.php?alter=$opt[1]");
            break;
        case $opt[2]:
            include 'formCor.html';
            break;
        case $opt[3]:
            include 'formDimensao.html';
            break;
        case $opt[4]:
            header("Location: TestaClasse.php?alter=$opt[4]");
            break;
        default:
            break;
    }
} else {
    echo "ol´´a mundo";
}
