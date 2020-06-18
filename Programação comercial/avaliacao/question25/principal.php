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
            table{
                border-collapse: colapse;
            }
            td{
                boder: 2px ; 
            }
            td.semana{
                background-color: yellowgreen;
            }
        </style>
    </head>
    <body>
        <?php
        $dia[] = "Segunda";
        $dia[] = "Terça";
        $dia[] = "Quarta";
        $dia[] = "Quinta";
        $dia[] = "Sexta";
        $dia[] = "Sábado";
        $dia[] = "Domingo";
        
        $prato[] = "Lasanha a quatro queijos";
        $prato[] = "Frango ao molho madeira";
        $prato[] = "Arroz à grega";
        $prato[] = "Feijoada à moda da casa";
        $prato[] = "Nhoque paulista";
        $prato[] = "Bacalhau ao forno";
        $prato[] = "Feijão branco";
        
        $preco[] = 12.60;
        $preco[] = 10.00;
        $preco[] = 09.40;
        $preco[] = 11.20;
        $preco[] = 08.50;
        $preco[] = 15.20;
        $preco[] = 10.00;
        ?>
         <table>
             <th>Elemento</th>
             <th>Dia da semana</th>
             <th>Prato do dia</th>
             <th>Preço</th>
        <?php
        for ($i = 0; $i < 7; $i++){
            echo "<tr>";
            $elemento = $i + 1;
            echo "<td>$elemento</td>";
            echo "<td>$dia[$i]</td>";
            echo "<td>$prato[$i]</td>";
            echo "<td>R$ $preco[$i]</td>";
            echo "</tr>";
        }
            
        ?>
         </table>
    </body>
</html>
