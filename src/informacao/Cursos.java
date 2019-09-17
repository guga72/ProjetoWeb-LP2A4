package informacao;

import java.util.ArrayList;

public class Cursos {
	String nome;
	String curso;
	String valor;
	String site;
	
	 ArrayList<Cursos> cursos = new ArrayList();
	 
	 public void criar(String nome1, String curso1, String valor1, String site1) {
		 Cursos c = new Cursos();
		 c.nome = nome1;
		 c.curso = curso1;
		 c.valor = valor1;
		 c.site = site1;
		 cursos.add(c);
	 }
	 
	 public void alterar(String nome1, String curso1, String valor1, String site1) {
		 int tam = cursos.size();
		 for (int a = 0; a<tam; a++) {
			 Cursos c = cursos.get(a);
			 if (c.curso == curso1){
				 c.valor = valor1;
				 c.nome = nome1;
				 c.site = site1;
			 }
		 }
	 }
	 
	 public void excluir(String curso1) {
		 int tam = cursos.size();
		 for (int a = 0; a<tam; a++) {
			 Cursos c = cursos.get(a);
			if (c.curso == curso1){
			 cursos.remove(a);
			 }
		 }
	 }
}
