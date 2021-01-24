package br.com.datainfo.controle;

import java.io.BufferedReader;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;

import br.com.datainfo.entidades.Usuario;
import br.com.datainfo.servico.UsuarioService;

/**
 * Servlet implementation class Login
 */
@WebServlet(name = "login", urlPatterns = { "/login" })
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private UsuarioService service = new UsuarioService();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String json = new String();
		BufferedReader reader = request.getReader();
		String linha;
		while ((linha = reader.readLine()) != null) {
			json += (linha);
		}
		System.out.println(json);
		ObjectMapper mapper = new ObjectMapper();
		Usuario usuario = mapper.readValue(json, Usuario.class);
		service.login(usuario);
	}

}
