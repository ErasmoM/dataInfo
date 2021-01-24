$(document).ready(function () {
    $("#formulario").submit(function (e) {
        var usuario = {
            email: $("#email").val(),
            senha: $("#senha").val()
        }
        e.preventDefault();
        $.ajax({
            type: "POST",
            url: 'http://localhost:8080/DataInfo/login',
            dataType: 'html' ,
            contentType: 'application/json',
            data: JSON.stringify(usuario),
            success: function() {
                alert("Login efetuado com sucesso!");
                window.location.href = "paginas/home.jsp";
              
              },
              error: function() {
                alert("Email ou senha incorretos!");
                
              }
        })
           
    })
  

});


