package br.com.datainfo.test;

import java.util.ArrayList;
import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import br.com.datainfo.entidades.Telefone;
import br.com.datainfo.entidades.Usuario;
import br.com.datainfo.servico.UsuarioService;

public class Tests {

	UsuarioService service = new UsuarioService();

	@Test
	public void persist() {
		UsuarioService service = new UsuarioService();
		List<Telefone> erasmoFones = new ArrayList<>();
		Telefone erasmoCell1 = new Telefone();
		erasmoCell1.setDdd(81);
		erasmoCell1.setNumero("997338619");
		erasmoCell1.setTipo("Residencial");
		erasmoFones.add(erasmoCell1);
		Telefone erasmoCell2 = new Telefone();
		erasmoCell2.setDdd(81);
		erasmoCell2.setNumero("997998619");
		erasmoCell2.setTipo("Residencial");
		erasmoFones.add(erasmoCell2);
		Usuario erasmo = new Usuario();
		erasmo.setEmail("erasmojmv16@gmail.com");
		erasmo.setNome("Erasmo");
		erasmo.setSenha("12345");
		erasmo.setTelefones(erasmoFones);
		erasmoCell1.setUsuario(erasmo);
		erasmoCell2.setUsuario(erasmo);
		System.out.println(erasmo);
		service.salvar(erasmo);
		System.out.println(erasmo);
		/*
		List<Telefone> robertFones = new ArrayList<>();
		Telefone robertCell1 = new Telefone();
		robertCell1.setDdd(81);
		robertCell1.setNumero("777338619");
		robertCell1.setTipo("Movel");
		robertFones.add(robertCell1);
		Telefone robertCell2 = new Telefone();
		robertCell2.setDdd(81);
		robertCell2.setNumero("887998619");
		robertCell2.setTipo("Residencial");
		robertFones.add(robertCell2);
		Usuario robert = new Usuario();
		robert.setEmail("robert@gmail.com");
		robert.setNome("Robert");
		robert.setSenha("12345");
		robert.setTelefones(robertFones);
		robertCell1.setUsuario(robert);
		erasmoCell2.setUsuario(robert);
		System.out.println(robert);
		service.salvar(robert);
		System.out.println(robert);
		*/
	}

	@Ignore
	public void login() {
		UsuarioService service = new UsuarioService();

		Usuario erasmo = new Usuario();
		erasmo.setEmail("puta@gmaill.com");
		erasmo.setSenha("111");

		System.out.println(erasmo);
		service.login(erasmo);

	}

	@Ignore
	public void atualizar() {
		List<Telefone> erasmoFones = new ArrayList<>();
		Telefone cell1 = new Telefone();
		cell1.setId(1L);
		cell1.setDdd(81);
		cell1.setNumero("997388000");
		cell1.setTipo("Movel");
		erasmoFones.add(cell1);
		Usuario erasmo = new Usuario();
		erasmo.setId(1l);
		erasmo.setEmail("puta@gmaill.com");
		erasmo.setNome("Bobert Santos");
		erasmo.setSenha("32345");
		erasmo.setTelefones(erasmoFones);
		cell1.setUsuario(erasmo);
		service.atualizar(erasmo);
		System.out.println(service.listarId(1L));

	}

	@Ignore
	public void deletar() {
		Usuario erasmo = new Usuario();
		erasmo.setId(1L);
		service.deletar(erasmo);
	}

	@Ignore
	public void buscar() {
		List<Usuario> lista = service.listar();
		for (Usuario user : lista) {
			System.out.println(user);
		}

	}

}
