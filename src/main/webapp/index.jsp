<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
    <meta charset="utf-8">
    <title>Login</title>
    <link rel="stylesheet" href="css/cadastro.css">
    <script src="js/Jquery.js"></script>
</head>

<body>
    <div class="containerCadastro" id="cadastro1">
        <form action="" method="post" id="formulario">
            <div class="titulo">
                <span>Login</span>
            </div>
            <div class="input-group">
                <label for="">Email</label><br> <input class="form-control" type="email" name="email" id="email"
                    size="37" ><br>
            </div>
            <div class="input-group">
                <label for="">Senha</label> <br> <input class="form-control" type="password" name="senha" id="senha"
                    size="37"><br>
            </div>
            <button type="submit" id="btLogar">Logar</button>
        </form>
        <button id="btCadastrar" onclick="cadastrar()">Cadastrar</button>
    </div>
    <script src="js/login.js"></script>
    <script src="js/passa.js"></script>
</body>

</html>