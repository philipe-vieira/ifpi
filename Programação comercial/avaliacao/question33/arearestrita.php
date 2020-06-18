<!DOCTYPE html>
<?php
session_start();
if (!isset($_SESSION["autenticado"]) || !isset($_SESSION["usuario"])) {
    //header("Location: http://localhost/avaliacao/question33/principal.php?erro=2");
}
?>
<html>
    <head>
        <meta charset="UTF-8">
        <title></title>
    </head>
    <body>
        <h2>Lista de tarefas.</h2>
        
        <?php
            if(isset($_SESSION["tarefas"])){
                $tarefas = $_SESSION["tarefas"];
                echo "<ol>";
                foreach ($tarefas as $tarefa) {
                    echo "<li>".$tarefa[0]."</li>";
                }
                echo "</ol>";
            }
        
        ?>
        
        <form action="adicionatarefas.php" method="POST">
            <label>Incluir nova tarefa na lista.</label><br>
            <input type="text" name="tarefa">
            <input type="submit" value="cadastrar">
        </form>
        
        <a href="logoff.php">[sair]</a>
        <?php
        
        
        ?>
    </body>
</html>
