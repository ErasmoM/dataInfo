$(document).ready(function () {
    $("#formulario").submit(function (e) {
        var usuario = {
            id: "null",
            nome: $("#nome").val(),
            email: $("#email").val(),
            senha: $("#senha").val(),
            telefones: [
                telefone = {
                    id: "null",
                ddd: $("#idDdd").val(),
                numero: $("#idNumero").val(),
                tipo: $("#idTipo").val()
                },
                telefone = {
                    id: "null",
                    ddd: $("#idDdd2").val(),
                    numero: $("#idNumero2").val(),
                    tipo: $("#idTipo2").val()
                }
            ]
        }
        e.preventDefault();
        $.ajax({
            type: "POST",
            url: 'http://localhost:8080/DataInfo/usuarioControle',
            dataType: 'html' ,
            contentType: 'application/json',
            data: JSON.stringify(usuario),
            success: function() {
                alert("Cadastrado com sucesso!");
                window.location.href = "home.jsp";
              },
              error: function() {
                alert("Usuario já cadastrado!");
              }
        })
           
    })

});


