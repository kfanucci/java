

public class TestaBanco {

	public static void main(String[] args) {
		Cliente paulo = new Cliente();
		paulo.nome = "Paulo Silveira";
		paulo.cpf = "443.116.148-10";
		paulo.profissao = "programador";
		
		Conta contaDoPaulo = new Conta();
		contaDoPaulo.deposita(100);
		
		// associa o cliente paulo a conta do contadDoPaulo
		contaDoPaulo.titular = paulo;
		System.out.println(contaDoPaulo.titular.nome);
		System.out.println(contaDoPaulo.titular);
		System.out.println(paulo);
		
		// prova de que o objeto paulo esta referenciado o mesmo do que o titular 

		// outra maneira de resolver
		// liga a setinha da classe Cliente para o titular paulo
		
		contaDoPaulo.titular = new Cliente();
		contaDoPaulo.titular.nome = "Paulo Marcelo";
				System.out.println(contaDoPaulo.titular.nome);
	
				System.out.println(contaDoPaulo.getSaldo());
				//encapsulou o saldo, está como privado
	
	}
}

