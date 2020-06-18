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
    <style>
        pre{
            color: <?php echo $_COOKIE["cor"]; ?>;
        }
    </style>
    <body>
        
        <form action="retornacor.php" method="POST">
            <?php
            if (!isset($_COOKIE["cor"])){
                echo "<label>Qual sua cor preferida?</label>";
                echo '<select name="cor">
                        <option value="red">Vermelho</option>
                        <option value="blue">Azul</option>
                        <option value="yellow">Amarelo</option>
                    </select>';
                echo '<input type="submit">';
            } else {
               
            }
        
            ?>
        </form>
        
        
        <pre>
        Aquarela
        Toquinho
  
Numa folha qualquer eu desenho um sol amarelo
E com cinco ou seis retas é fácil fazer um castelo
Corro o lápis em torno da mão e me dou uma luva
E se faço chover, com dois riscos tenho um guarda-chuva
Se um pinguinho de tinta cai num pedacinho azul do papel
Num instante imagino uma linda gaivota a voar no céu

Vai voando, contornando a imensa curva norte-sul
Vou com ela viajando Havaí, Pequim ou Istambul
Pinto um barco a vela branco navegando
É tanto céu e mar num beijo azul

Entre as nuvens vem surgindo um lindo avião rosa e grená
Tudo em volta colorindo, com suas luzes a piscar
Basta imaginar e ele está partindo, sereno e lindo
E se a gente quiser ele vai pousar

Numa folha qualquer eu desenho um navio de partida
Com alguns bons amigos bebendo de bem com a vida
De uma América a outra consigo passar num segundo
Giro um simples compasso e num círculo eu faço o mundo

Um menino caminha e caminhando chega no muro
E ali logo em frente a esperar pela gente o futuro está
E o futuro é uma astronave que tentamos pilotar
Não tem tempo nem piedade nem tem hora de chegar
Sem pedir licença muda nossa vida
Depois convida a rir ou chorar

Nessa estrada não nos cabe conhecer ou ver o que virá
O fim dela ninguém sabe bem ao certo onde vai dar
Vamos todos numa linda passarela
De uma aquarela que um dia enfim
Descolorirá

Numa folha qualquer eu desenho um sol amarelo
Que descolorirá
E com cinco ou seis retas é fácil fazer um castelo
Que descolorirá
Giro um simples compasso e num círculo eu faço o mundo
Que descolorirá
        </pre>
        <?php
        // put your code here
        ?>
    </body>
</html>
