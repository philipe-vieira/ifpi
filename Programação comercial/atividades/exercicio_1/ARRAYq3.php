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
           $str = "o php foi criado em noventa em cinco";
           $str = str_replace ("o","0",$str);
           $str = str_replace ("a","4",$str);
           $str = str_replace ("i","1",$str);
           echo $str;
                
        ?>
    </body>
</html>
