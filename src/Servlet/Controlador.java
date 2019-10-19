package Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import informacao.Cliente;
import informacao.Cursos;
import informacao.Pagamentos;


@WebServlet("/Controlador")
public class Controlador extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public String sessao_user;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("teste");
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("projetoweb");
		EntityManager em = emf.createEntityManager();
		String tipo = request.getParameter("formulario");
		if(tipo.equals("login")) {
			sessao_user = request.getParameter("inputEmail3");
			String senha = request.getParameter("senha");			
		}
		
		if(tipo.equals("cliadd")) {
			String nome = request.getParameter("inputNome");
			String email = request.getParameter("inputEMAIL");
			String cpf = request.getParameter("inputEmail3");
			Cliente c = new Cliente(cpf,nome,email);
			em.getTransaction().begin();
			em.persist(c);
			em.getTransaction().commit();
			response.sendRedirect("index.jsp");
		}
		
		if(tipo.equals("clialt")) {
		String nome = request.getParameter("inputNome");
		String email = request.getParameter("inputEMAIL");
		String cpf = request.getParameter("inputEmail3");
		Cliente c = em.find(Cliente.class, cpf);
		if (c == null) {
			PrintWriter out = response.getWriter();
			out.println("<script type=\"text/javascript\">");
			out.println("alert('Cliente Não Cadastrado!');");
			out.println("location='/ProjetoWEB/clientes/index.jsp';");
			out.println("</script>");
			out.close();
		}
		else {
		c.setEmail(email);
		c.setNome(nome);
		em.getTransaction().begin();
		em.merge(c);
		em.getTransaction().commit();
		response.sendRedirect("index.jsp");
		}
		}
		
		if(tipo.equals("clirem")) {
			
		String cpf = request.getParameter("inputEmail3");
		Cliente c = em.find(Cliente.class, cpf);
		if (c == null) {
			PrintWriter out = response.getWriter();
			out.println("<script type=\"text/javascript\">");
			out.println("alert('Cliente Não Cadastrado!');");
			out.println("location='/ProjetoWEB/clientes/index.jsp';");
			out.println("</script>");
			out.close();
		}
		else {
		em.getTransaction().begin();
		em.remove(c);
		em.getTransaction().commit();
		response.sendRedirect("index.jsp");
		}
		}
		if(tipo.equals("clicon")) {
			String cpf = request.getParameter("inputEmail3");
			Cliente c = em.find(Cliente.class, cpf);
			if (c == null) {
				PrintWriter out = response.getWriter();
				out.println("<script type=\"text/javascript\">");
				out.println("alert('Cliente Não Cadastrado!');");
				out.println("location='/ProjetoWEB/clientes/index.jsp';");
				out.println("</script>");
				out.close();
			}
			else {
				PrintWriter out = response.getWriter();
				out.println("<script type=\"text/javascript\">");
				out.println("alert('"+c.toString()+"');");
				out.println("location='/ProjetoWEB/clientes/index.jsp';");
				out.println("</script>");
				out.close();
			}
		}
		if(tipo.equals("curadd")){
			String nome = request.getParameter("inputNome");
			String curso = request.getParameter("inputCURSO");
			String valor = request.getParameter("inputVALOR");
			String site = request.getParameter("inputSITE");
			Cursos c1 = new Cursos(nome,curso,Float.parseFloat(valor), site);
			em.getTransaction().begin();
			em.persist(c1);
			em.getTransaction().commit();
			/*Cursos c = new Cursos();
			c.criar(nome, curso, valor, site);*/
			response.sendRedirect("index.jsp");
		}
		
		if(tipo.equals("curalt")){
			String nome = request.getParameter("inputNome");
			String curso = request.getParameter("inputCURSO");
			String valor = request.getParameter("inputVALOR");
			String site = request.getParameter("inputSITE");
			Cursos c1 = em.find(Cursos.class, curso);
			if (c1 == null) {
				PrintWriter out = response.getWriter();
				out.println("<script type=\"text/javascript\">");
				out.println("alert('Curso Não Cadastrado!');");
				out.println("location='/ProjetoWEB/cursos/index.jsp';");
				out.println("</script>");
				out.close();
			}
			else {
			c1.setNome(nome);
			c1.setSite(site);
			c1.setValor(Float.parseFloat(valor));
			em.getTransaction().begin();
			em.merge(c1);
			em.getTransaction().commit();
			/*Cursos c = new Cursos();
			c.alterar(nome, curso, valor, site);*/
			response.sendRedirect("index.jsp");
			}
		}
		
		if(tipo.equals("currem")){
			String curso = request.getParameter("inputCURSO");
			Cursos c1 = em.find(Cursos.class, curso);
			if (c1 == null) {
				PrintWriter out = response.getWriter();
				out.println("<script type=\"text/javascript\">");
				out.println("alert('Curso Não Cadastrado!');");
				out.println("location='/ProjetoWEB/cursos/index.jsp';");
				out.println("</script>");
				out.close();
			}
			else {
			em.getTransaction().begin();
			em.remove(c1);
			em.getTransaction().commit();
			response.sendRedirect("index.jsp");
			}
		}
		if(tipo.equals("curcon")) {
			String curso = request.getParameter("inputCURSO");
			Cursos c1 = em.find(Cursos.class, curso);
			if (c1 == null) {
				PrintWriter out = response.getWriter();
				out.println("<script type=\"text/javascript\">");
				out.println("alert('Curso Não Cadastrado!');");
				out.println("location='/ProjetoWEB/cursos/index.jsp';");
				out.println("</script>");
				out.close();
			}
			else {
				PrintWriter out = response.getWriter();
				out.println("<script type=\"text/javascript\">");
				out.println("alert('"+c1.toString()+"');");
				out.println("location='/ProjetoWEB/clientes/index.jsp';");
				out.println("</script>");
				out.close();
			}
		}
		
		if(tipo.equals("pagalt")) {
			String cpf = request.getParameter("inputEmail3");
			String curso = request.getParameter("inputCURSO");
			String data_insc = request.getParameter("inputDATA");
			Pagamentos p = em.find(Pagamentos.class, cpf);
			if (p == null) {
				PrintWriter out = response.getWriter();
				out.println("<script type=\"text/javascript\">");
				out.println("alert('Pagamento Não Cadastrado!');");
				out.println("location='/ProjetoWEB/pagamentos/index.jsp';");
				out.println("</script>");
				out.close();
			}
			else {
			p.setCurso(curso);
			p.setData_insc(data_insc);
			em.getTransaction().begin();
			em.merge(p);
			em.getTransaction().commit();
			response.sendRedirect("index.jsp");
			}
		}
		if(tipo.equals("pagadd")) {
			String cpf = request.getParameter("inputEmail3");
			String curso = request.getParameter("inputCURSO");
			String data_insc = request.getParameter("inputDATA");
			Pagamentos p = new Pagamentos(cpf,curso,data_insc);
			em.getTransaction().begin();
			em.persist(p);
			em.getTransaction().commit();
			response.sendRedirect("index.jsp");
		}
		if(tipo.equals("pagrem")) {
			String cpf = request.getParameter("inputEmail3");
			Pagamentos p = em.find(Pagamentos.class, cpf);
			if (p == null) {
				PrintWriter out = response.getWriter();
				out.println("<script type=\"text/javascript\">");
				out.println("alert('Pagamento Não Cadastrado!');");
				out.println("location='/ProjetoWEB/pagamentos/index.jsp';");
				out.println("</script>");
				out.close();
			}
			else {
			em.getTransaction().begin();
			em.remove(p);
			em.getTransaction().commit();
			response.sendRedirect("index.jsp");
			}
		}
		if(tipo.equals("pagcon")) {
			/*List<Pagamentos> pag = em.createQuery("Select * from pagamento").getResultList();
			em.getTransaction().commit();
			if (pag == null) {
				PrintWriter out = response.getWriter();
				out.println("<script type=\"text/javascript\">");
				out.println("alert('Pagamento Não Cadastrado!');");
				out.println("location='/ProjetoWEB/pagamentos/index.jsp';");
				out.println("</script>");
				out.close();
			}
			else {
				PrintWriter out = response.getWriter();
				out.println("<tr>");
				for(Pagamentos pag1 : pag) {
					out.println("<td>"+pag1.toString()+"</td>");
				}
				out.println("</tr>");
			}*/
		}
		em.close();
		emf.close();
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
