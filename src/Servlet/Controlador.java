package Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import informacao.Cliente;
import informacao.Cursos;


@WebServlet("/Controlador")
public class Controlador extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String tipo = request.getParameter("formulario");
		if(tipo.equals("cliadd")) {
			String nome = request.getParameter("inputNome");
			String email = request.getParameter("inputEMAIL");
			String cpf = request.getParameter("inputEmail3");
			Cliente c = new Cliente();
			c.criar(nome, email, cpf);
			response.sendRedirect("index.html");
		}
		
		if(tipo.equals("clialt")) {
		String nome = request.getParameter("inputNome");
		String email = request.getParameter("inputEMAIL");
		String cpf = request.getParameter("inputEmail3");
		Cliente c = new Cliente();
		c.alterar(nome, email, cpf);
		response.sendRedirect("index.html");
		}
		
		if(tipo.equals("clirem")) {
		String cpf = request.getParameter("inputEmail3");
		Cliente c = new Cliente();
		c.excluir(cpf);
		response.sendRedirect("index.html");
		}
		if(tipo.equals("curadd")){
			String nome = request.getParameter("inputNome");
			String curso = request.getParameter("inputCURSO");
			String valor = request.getParameter("inputVALOR");
			String site = request.getParameter("inputSITE");
			Cursos c = new Cursos();
			c.criar(nome, curso, valor, site);
			response.sendRedirect("index.html");
		}
		
		if(tipo.equals("curalt")){
			String nome = request.getParameter("inputNome");
			String curso = request.getParameter("inputCURSO");
			String valor = request.getParameter("inputVALOR");
			String site = request.getParameter("inputSITE");
			Cursos c = new Cursos();
			c.alterar(nome, curso, valor, site);
			response.sendRedirect("index.html");
		}
		if(tipo.equals("currem")){
			String curso = request.getParameter("inputCURSO");
			Cursos c = new Cursos();
			c.excluir(curso);
			response.sendRedirect("index.html");
		}
				
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
