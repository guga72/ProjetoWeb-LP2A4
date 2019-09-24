<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <h1>teste</h1>
    <%@ page import="informacao.Cliente" %>
    <%@ page import="informacao.Cursos" %>
    <%@ page import="informacao.Pagamentos" %>
    <%@ page import="Servlet.Controlador" %>
    <%@ include file="login.jsp" %>
<%
String cpf = request.getParameter("inputEmail3");
String senha = request.getParameter("senha");	
if (cpf.equals("123.123.123-33") && senha.equals("1234") ){
	ServletContext ctx = getServletContext();
	ctx.setAttribute("login",cpf);
	response.sendRedirect("index.html");
}
else{
	response.sendRedirect("login.jsp");
}
%>

</body>
</html>