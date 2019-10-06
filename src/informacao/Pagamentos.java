package informacao;

import javax.persistence.Entity;

@Entity
public class Pagamentos {
	String cpf;
	String curso;
	String data_insc;
	
	public Pagamentos(String cpf, String curso, String data_insc) {
		this.cpf = cpf;
		this.curso = curso;
		this.data_insc = data_insc;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public String getData_insc() {
		return data_insc;
	}

	public void setData_insc(String data_insc) {
		this.data_insc = data_insc;
	}
	@Override
	public String toString() {
		return "Pagamento cpf= " + cpf + " curso= " + curso + " data_insc= " + data_insc;
	}
}
