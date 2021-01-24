<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
    <meta charset="utf-8">
    <title>Cadastro</title>
    <link rel="stylesheet" href="../css/cadastro.css">
    <script src="../js/Jquery.js"></script>
</head>

<body>
    <div class="containerCadastro" id="cadastro1">
        <form action="" method="post" id="formulario">
            <div class="titulo">
                <span>Cadastro</span>
            </div>
            <div class="input-group">
                <label for="">Nome</label><br> <input type="text" class="form-control" name="nome" id="nome" size="37"
                    maxlength="40" required=""><br>
            </div>
            <div class="input-group">
                <label for="">Email</label><br> <input type="text" class="form-control" name="email" id="email"
                    size="37" required=""><br>
            </div>
            <div class="input-group">
                <label for="">Senha</label> <br> <input type="text" class="form-control" name="senha" id="senha"
                    size="37" required=""><br>
            </div>
            <div class="input-group">
                <label for="">DDD</label><br>
                <input  type="number" class="form-control" name="ddd" id="idDdd" size="37"><br>
            </div>
            <div class="input-group">
                <label for="">Numero</label> <br>
                <input type="number" class="form-control" name="numero" id="idNumero" size="37"><br>
            </div>
            <div class="input-group">
                <label id="tipo" for="">Tipo</label><br>
                <select name="tipo" id="idTipo">
                    <option value="residencial">Residencial</option>
                    <option value="movel">Movel</option>
                </select>
            </div>
            <div class="input-group">
                <label for="">DDD</label><br>
                <input type="number" class="form-control" name="ddd" id="idDdd2" size="37"><br>
            </div>
            <div class="input-group">
                <label for="">Numero</label> <br>
                <input type="number" class="form-control" name="numero" id="idNumero2" size="37"><br>
            </div>
            <div class="input-group">
                <label id="tipo" for="">Tipo</label><br>
                <select name="tipo" id="idTipo2">
                    <option value="residencial">Residencial</option>
                    <option value="movel">Movel</option>
                </select>
            </div>



            <button type="submit" id="bt">Cadastrar</button>
        </form>
    </div>
    <script src="../js/cadastrar.js"></script>
</body>

</html>