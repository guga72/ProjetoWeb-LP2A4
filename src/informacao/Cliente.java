package informacao;

import java.util.ArrayList;

public class Cliente {

	String nome;
	String email;
	String cpf;
	
	 static ArrayList<Cliente> clientes = new ArrayList();
	 
	 public static void criar(String nome1, String email1, String cpf1) {
		 System.out.println("teste1");
		 Cliente c = new Cliente();
		 c.nome = nome1;
		 c.email = email1;
		 c.cpf = cpf1;
		 clientes.add(c);
	 }
	 
	 public static void alterar(String nome1, String email1, String cpf1) {
		 int tam = clientes.size();
		 for (int a = 0; a<tam; a++) {
			 Cliente c = clientes.get(a);
			 if (c.cpf == cpf1){
				 c.email = email1;
				 c.nome = nome1;
			 }
		 }
	 }
	 
	 public static void excluir(String cpf1) {
		 int tam = clientes.size();
		 for (int a = 0; a<tam; a++) {
			 Cliente c = clientes.get(a);
			 if (c.cpf == cpf1){
			 clientes.remove(a);
			 }
		 }
	 }
}
