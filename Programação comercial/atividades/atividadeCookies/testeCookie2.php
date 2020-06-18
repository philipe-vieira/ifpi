<?php
    $tempomaximo = time() + 30;
    if (isset($_COOKIE["qtvisitas"])){
        echo "Voce visitou essa pagina ".$_COOKIE["qtvisitas"]." vezes.";
        setcookie("qtvisitas", $_COOKIE["qtvisitas"]+1, $tempomaximo);
    } else {
        echo "esse é o seu primeiro acesso à pagina!";
        setcookie("qtvisitas", 1, $tempomaximo);
    }
?>