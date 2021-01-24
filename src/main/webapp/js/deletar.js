$(document).ready(function () {
    $("#formulario").submit(function (e) {
        var usuario = {
            email: $("#email").val() 
        }
        e.preventDefault();
        $.ajax({
            type: "DELETE",
            url: 'http://localhost:8080/DataInfo/usuarioControle',
            dataType: 'html' ,
            contentType: 'application/json',
            data: JSON.stringify(usuario),
            success: function() {
                alert("Deletado com sucesso!");
                window.location.href = "home.jsp";
              },
              error: function() {
                alert("Usuario não encontrado!");
              }
        })
           
    })

});


