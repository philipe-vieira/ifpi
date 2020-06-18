
        <?php
            if(! isset($_COOKIE["nome"])){
                echo 'O cookie nao existe';
            }else{
                echo "olá".$_COOKIE["nome"]."!";
            }
        ?>
