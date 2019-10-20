package informacao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="cliente")
public class Cliente {
	@Column(name = "nome")
	private String nome;
	@Column(name = "email")
	private String email;
	@Id
	@Column(name = "cpf")
	private String cpf;
	
	
	public Cliente(String nome, String email, String cpf) {
		this.nome = nome;
		this.email = email;
		this.cpf = cpf;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getCpf() {
		return cpf;
	}


	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	 @Override
	 public String toString() {
		return "Cliente cpf= " + cpf + " nome= " + nome + " email= " + email;
		 
	 }
	 
}
