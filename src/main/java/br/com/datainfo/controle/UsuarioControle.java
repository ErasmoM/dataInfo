package br.com.datainfo.controle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.stream.Collectors;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;

import br.com.datainfo.dto.UsuarioDto;
import br.com.datainfo.entidades.Usuario;
import br.com.datainfo.servico.UsuarioService;

/**
 * Servlet implementation class ServletUsuario
 */
@WebServlet(name = "usuarioControle", urlPatterns = { "/usuarioControle" })
public class UsuarioControle extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private UsuarioService service = new UsuarioService();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public UsuarioControle() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		List<UsuarioDto> listDto = service.listar().stream().map(x -> new UsuarioDto(x)).collect(Collectors.toList());
		PrintWriter out = response.getWriter();
		ObjectMapper objectMapper = new ObjectMapper();
		String jsonString = objectMapper.writeValueAsString(listDto);
		response.setContentType("application/json");
		response.setCharacterEncoding("UTF-8");
		out.print(jsonString);
		out.flush();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String json = new String();
		BufferedReader reader = request.getReader();
		String linha;
		while ((linha = reader.readLine()) != null) {
			json += (linha);
		}
		System.out.println(json);
		ObjectMapper mapper = new ObjectMapper();
		Usuario usuario = mapper.readValue(json, Usuario.class);
		service.salvar(usuario);
	}

	/**
	 * @see HttpServlet#doPut(HttpServletRequest, HttpServletResponse)
	 */
	protected void doPut(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String json = new String();
		BufferedReader reader = request.getReader();
		String linha;
		while ((linha = reader.readLine()) != null) {
			json += (linha);
		}
		ObjectMapper mapper = new ObjectMapper();
		Usuario usuario = mapper.readValue(json, Usuario.class);
		System.out.println(usuario);
		service.atualizar(usuario);
	}

	/**
	 * @see HttpServlet#doDelete(HttpServletRequest, HttpServletResponse)
	 */
	protected void doDelete(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String json = new String();
		BufferedReader reader = request.getReader();
		String linha;
		while ((linha = reader.readLine()) != null) {
			json += (linha);
		}
		ObjectMapper mapper = new ObjectMapper();
		Usuario user = mapper.readValue(json, Usuario.class);
		service.deletar(user);
	}

}
