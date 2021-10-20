


<?php

$con = mysqli_connect('localhost:3307', 'root','', 'cadastro');

$codigo = $_GET['codigo'];

$sql = "DELETE FROM usuarios WHERE codigo = '$codigo'";

if (mysqli_query($con, $sql)){
    header('Location: consultas.php');
}else{
    echo "Erro ao efetuar exclusão";
}

mysqli_close($conexao);
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
        </div>

    </body>     
</html>



