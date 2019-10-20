<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="informacao.Cliente" %>
    <%@ page import="informacao.Cursos" %>
    <%@ page import="informacao.Pagamentos" %>
    <%@ page import="Servlet.Controlador" %>
<%
String vali = (String)session.getAttribute("theName");
if(vali == null){
	%>
	<script>
	alert("Usuário não logado")
	location = "/ProjetoWEB/login.jsp";
	</script>
	
	<%
}
%>