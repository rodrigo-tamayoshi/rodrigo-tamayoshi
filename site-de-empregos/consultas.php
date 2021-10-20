<?php

include_once("conexao.php");

$filtro = isset($_GET['filtro'])?$_GET['filtro']:"";

$sql = "select * from usuarios where profissao like '%$filtro%' order by nome";
$consulta = mysqli_query($conexao,$sql);
$registros = mysqli_num_rows($consulta);





?>

<!DOCTYPE html>
<html lang="pt-br">
    <head>
        <meta charset="UTF-8">
        <title>Sistema de Cadastro</title>
        <link rel="stylesheet" href="_css/estilo.css">
    </head>
    <body>
        <div class="container">
            <nav> 
                <ul class="menu">
                    <a href="index.php"><li>Cadastro</li>
                   <a href="consultas.php"><li>Consultas</li></a>
            </nav>
            <section>
                <h1>Consultas</h1>
                <br><br><br>

                <form method="get" action="">
                    Filtrar por profissão <input type="text" name="filtro" class="campo" required autofocus>
                    <input type="submit" value="Pesquisar" class="btn">
                </form>
                

              
              <?php

                    if($filtro!=""){
                    echo "Resultado da pesquisa com a palavra <strong>$filtro</strong>: ";}
                    else
                    echo ". <br><br>$registros Registros Encontrados.";

                    echo"<br><br>";

                    while($exibirRegistros = mysqli_fetch_array($consulta)){


                        $codigo = $exibirRegistros[0];
                        $nome = $exibirRegistros[1];
                        $email = $exibirRegistros[2];
                        $profissao = $exibirRegistros[3];
                        
                        
                        print "<article>";

                        print "<strong>$codigo</stong><br>";
                        print "$nome<br>";
                        print "$profissao<br>";
                        echo "<td><a class='button' href='excluir.php?codigo=$codigo'>Excluir</a></td>";


                        print"</article>";
                    }

                    mysqli_close($conexao);

                ?>
               
            </section>

    </div>

    </body>
</html>

