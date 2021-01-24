package br.com.datainfo.dto;

import java.io.Serializable;
import java.util.List;
import java.util.stream.Collectors;

import br.com.datainfo.entidades.Usuario;


public class UsuarioDto implements Serializable {


	private static final long serialVersionUID = 1L;

	private Long id;

	private String nome;

	private String email;

	private String senha;

	private List<TelefoneDto> telefones;

	public UsuarioDto() {

	}

	public UsuarioDto(Usuario obj) {
		id = obj.getId();
		nome = obj.getNome();
		email = obj.getEmail();
		senha = obj.getSenha();
		telefones = obj.getTelefones().stream().map(x -> new TelefoneDto(x)).collect(Collectors.toList());
	}

	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public List<TelefoneDto> getTelefones() {
		return telefones;
	}

	public void setTelefones(List<TelefoneDto> telefones) {
		this.telefones = telefones;
	}

	@Override
	public String toString() {
		return "UsuarioDto [id=" + id + ", nome=" + nome + ", email=" + email + ", senha=" + senha + ", telefones="
				+ telefones + "]";
	}

	
}