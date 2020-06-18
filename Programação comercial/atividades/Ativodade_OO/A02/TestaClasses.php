<!DOCTYPE html>

<html>
    <head>
        <meta charset="UTF-8">
        <meta http-equiv="refresh" content="2">
        <title>Testa classes</title>
        <style>
            table{
                margin: 15%;
                border-spacing: 25px;
            }
            td, th{
                
            }
        </style>
    </head>
    <body>
        <?php
        include_once ("Cachorro.php");
        include_once ("Relogio.php");
        
        $toto = new Cachorro();
        $relogio = new Relogio();  ?>

        <table>
          <tr>
              <th><h1>Classe Cachorro</h1></th>
              <th><h1>Classe Relógio</h1></th>
          </tr>
          <tr>
            <td>
                <?php
                $toto->latir("Toto", "6 meses", "Pinscher");
                ?>
            </td>
            <td>
                <?php
                $relogio->mostrarHora("150g" , "lg", 300.0);
                ?>
            </td>
          </tr>
          <tr>
            <td>
                <?php
                $toto->brincar("Toto", "6 meses", "Pinscher");
                ?>
            </td>
            <td>
                <?php
                $relogio->ajustarHora("100g" , "rolex", 3200.00);
                ?>
            </td>
          </tr>
        </table>
  
    </body>
</html>
