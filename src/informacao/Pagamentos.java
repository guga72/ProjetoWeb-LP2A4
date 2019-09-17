package informacao;

import java.util.ArrayList;

public class Pagamentos {
	String cpf;
	String curso;
	String data_insc;
	
	 ArrayList<Pagamentos> pagamento = new ArrayList();
	 
	 public void criar(String cpf1, String curso1, String data_insc1) {
		 Pagamentos p = new Pagamentos();
		 p.cpf = cpf1;
		 p.curso = curso1;
		 p.data_insc = data_insc1;
		 pagamento.add(p);
	 }
	 
	 public void alterar(String cpf1, String curso1, String data_insc1) {
		 int tam = pagamento.size();
		 for (int a = 0; a<tam; a++) {
			 Pagamentos p = pagamento.get(a);
			 if (p.cpf == cpf1){
				 p.curso = curso1;
				 p.data_insc = data_insc1;
			 }
		 }
	 }
	 
	 public void excluir(String cpf1) {
		 int tam = pagamento.size();
		 for (int a = 0; a<tam; a++) {
			 Pagamentos p = pagamento.get(a);
			 if (p.cpf == cpf1){
				 pagamento.remove(a);
			 }
		 }
	 }
}
