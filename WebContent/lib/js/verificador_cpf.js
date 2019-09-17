function VerificarCPF(){
	var cpf = document.getElementById("inputEmail3").value;
	
	regex = /^\d{3}\.\d{3}\.\d{3}\-\d{2}$/;
	resultado = regex.test(cpf);
	
	
	if (cpf == "000.000.000-00" || cpf == "111.111.111-11" || cpf == "222.222.222-22"|| cpf == "333.333.333-33" || cpf == "444.444.444-44" || cpf == "555.555.555-55" || cpf == "666.666.666-66" || cpf == "777.777.777-77" || cpf == "888.888.888-88" || cpf == "999.999.999-99" ||resultado == false) {
					alert("cpf invalido");
				}
	}

function VerificarEmail(){
	var email = document.getElementById("inputEMAIL").value;
	if(email.indexOf("@") == -1 || email.indexOf(".com") == -1){
		alert("precisa ser um e-mail valido");
	}
}

function Chama(){
	VerificarEmail();
	VerificarCPF();
}