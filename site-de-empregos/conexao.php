<?php

$hostname = "127.0.0.1:3307";
$user = "root";
$password = "";
$database = "cadastro";
$conexao = mysqli_connect($hostname,$user,$password, $database);

if(!$conexao){
    print " Falha na conexão com o Banco de Dados";
}

?>