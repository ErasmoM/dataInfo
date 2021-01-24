package br.com.datainfo.dto;

import java.io.Serializable;

import br.com.datainfo.entidades.Telefone;
import br.com.datainfo.entidades.Usuario;

public class TelefoneDto implements Serializable{


	private static final long serialVersionUID = 1L;

	private Long id;

	private int ddd;

	private String numero;

	private String tipo;

	private Usuario usuario;

	public TelefoneDto(Telefone obj) {
		id = obj.getId();
		ddd = obj.getDdd();
		numero = obj.getNumero();
		tipo = obj.getTipo();
		usuario = obj.getUsuario();
	}

	
	
	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public int getDdd() {
		return ddd;
	}



	public void setDdd(int ddd) {
		this.ddd = ddd;
	}



	public String getNumero() {
		return numero;
	}



	public void setNumero(String numero) {
		this.numero = numero;
	}



	public String getTipo() {
		return tipo;
	}



	public void setTipo(String tipo) {
		this.tipo = tipo;
	}



	public Long getUsuario() {
		return usuario.getId();
	}



	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}



	@Override
	public String toString() {
		return "TelefoneDto [id=" + id + ", ddd=" + ddd + ", numero=" + numero + ", tipo=" + tipo + "]";
	}

}
