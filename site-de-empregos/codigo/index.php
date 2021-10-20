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
                <h1>Cadastro de Usuários</h1>
                <br><br><br>

                <form method="post" action="processa.php" acton="excluir.php">
                    <input type="submit" value="Salvar" class="btn" >
                    <input type="reset" value="Limpar" class="btn">
                    <br><br>

                    Nome<br>
                    <input type="text" name="nome" class="campo" maxlength="40" required autofocus><br>
                    Email<br>
                    <input type="text" name="email" class="campo" maxlength="50" required><br>
                    Profissão<br>
                    <input type="text" name="profissao" class="campo" maxlength="40" required><br>
                </form>
                <footer class="rodape">
                    <p class="copyright">&copy; Copyright Igor e Rodrigo - 2020 </p>
                </footer>
            </section>

    </div>

    </body>
</html>

