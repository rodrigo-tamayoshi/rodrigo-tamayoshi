<?php 
include_once("conexao.php");

$nome = $_POST['nome'];
$email = $_POST['email'];
$profissao = $_POST['profissao'];

$sql = "insert into usuarios (nome,email,profissao) values  ('$nome', '$email', '$profissao')";
$salvar = mysqli_query($conexao,$sql);
$linhas = mysqli_affected_rows($conexao);

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
            <section>
                <h1> Confirmação de Cadastro</h1>
                <br><br><br>

                <?php

                if($linhas ==1){
                    echo "Cadastro Efetuado Com Sucesso!";
                }else{
                    echo"Cadastro NÃO efetuado.<br><br> Já existe um usuário com este endereço de Email";
                }


                ?>

               
            </section>

        </div>

    </body>
</html>



