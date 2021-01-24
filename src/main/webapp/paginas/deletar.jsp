<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Deletar</title>
    <link rel="stylesheet" href="../css/cadastro.css">
    <script src="../js/Jquery.js"></script>
</head>

<body>
    <div class="containerCadastro" id="cadastro1">
        <form action="" method="delete" id="formulario">
            <div class="input-group">
                <label for="">Entre com o E-mail para deletar</label><br> <input type="email" name="email" id="email" size="37" required=""><br>
            </div>
            <button id="bt" type="submit">Deletar</button>
        </form>
    </div>
    <script src="../js/deletar.js"></script>
</body>

</html>