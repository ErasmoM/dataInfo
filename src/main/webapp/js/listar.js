$(document).ready(function(){
	$('#tabela').empty(); 
	$.ajax({
		type:'GET',		
		dataType: 'json',
		url: 'http://localhost:8080/DataInfo/usuarioControle',
		success: function(dados){
			
			for(var i=0;dados.length>i;i++){
				var telefone = dados[i].telefones;
				$('#tabelaUsu').append('<tr><td>'+dados[i].nome+'</td><td>'+dados[i].email+'</td><td>'+dados[i].senha+'</td><td><button type="submit" onclick="deletar()">Deletar</button></td><td><button type="submit" onclick="atualizar()">Atualizar</button></td><tr/>');
				for(var i=0;telefone.length>i;i++){
					$('#tabelaTele').append('<tr><td>'+telefone[i].ddd+'</td><td>'+telefone[i].numero+'</td><td>'+telefone[i].tipo+'</td><tr/>');
				}
			}
		}
	});
});

function atualizar() {
	window.location.href = "atualizar.jsp";
}

function deletar() {
	window.location.href = "deletar.jsp";
}