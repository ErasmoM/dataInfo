package br.com.datainfo.servico;

import java.util.List;

import br.com.datainfo.dao.JpaDao;
import br.com.datainfo.entidades.Telefone;
import br.com.datainfo.entidades.Usuario;
import br.com.datainfo.exceptions.UsuarioException;

public class UsuarioService {

	private JpaDao dao = new JpaDao();

	public List<Usuario> listar() {

		List<Usuario> lista = dao.listar("FROM Usuario");
		if (lista == null) {
			throw new UsuarioException("Não existem usuarios cadastrados");
		}
		return lista;
	}

	public Usuario listarId(Long id) {
		Usuario user = dao.listarId(id);
		if (user == null) {
			throw new UsuarioException("Usuario não encontrado");
		}
		return user;
	}

	public void salvar(Usuario usuario) {
		if (cadastrado(usuario)) {
			throw new UsuarioException("Usuario já cadastrado");
		} else {
			List<Telefone> telefones = usuario.getTelefones();
			for (Telefone telefone : telefones) {
				telefone.setUsuario(usuario);
			}
			usuario.setTelefones(telefones);
			dao.salvar(usuario);
		}
	}

	public void atualizar(Usuario usuario) {
			Usuario user = buscar(usuario); 
		if(user == null){
			throw new UsuarioException("Usuario não encontrado");
		}
		user.setNome(usuario.getNome());
		user.setSenha(usuario.getSenha());
		user.setEmail(usuario.getEmail());
		List<Telefone> telefones = usuario.getTelefones();
		for (Telefone telefone : telefones) {
			telefone.setUsuario(user);
		}
		user.setTelefones(telefones);
		dao.atualizar(user);
	}

	public void deletar(Usuario usuario) {
		Usuario user = buscar(usuario); 
		if(user == null){
			throw new UsuarioException("Usuario não encontrado");
		}else {
			dao.deletar(user);
		}
	}

	private boolean cadastrado(Usuario usuario) {
		for (Usuario user : dao.listar("FROM Usuario")) {
			if (user.getEmail().equals(usuario.getEmail())) {
				return true;
			}
		}
		return false;
	}
	
	
	public boolean login(Usuario usuario) {
		if(procurar(usuario) == false) {
			throw new UsuarioException("Email ou senha incorretos!");
		}
		return true;
	}

	private boolean procurar(Usuario usuario) {
		for (Usuario user : dao.listar("From Usuario")) {
			if (user.getEmail().equals(usuario.getEmail()) && user.getSenha().equals(usuario.getSenha())) {
				return true;
			}
		}
		return false;

	}
	
	private Usuario buscar(Usuario usuario) {
		for (Usuario user : dao.listar("FROM Usuario")) {
			if (user.getEmail().equals(usuario.getEmail())) {
				return user;
			}
		}
		return null;
	}
	
	
}
