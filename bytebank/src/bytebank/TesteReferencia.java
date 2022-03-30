package bytebank;

public class TesteReferencia {

	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 300;
		
		System.out.println("Saldo da primeira conta: " + primeiraConta.saldo);

		Conta segundaConta = primeiraConta;
		System.out.println("saldo da segunda conta: " + segundaConta.saldo);
		
		segundaConta.saldo += 100;
		System.out.println("saldo da segunda conta: " + segundaConta.saldo);
		System.out.println("Saldo da primeira conta: " + primeiraConta.saldo);
		
		// aqui ao copiar a primeiraconta na verdade apenas criou outra referencia para 
		// o mesmo objeto. logo só temos 1 objeto para 2 referencias.
		
		System.out.println(primeiraConta);
		System.out.println(segundaConta);
		
		// acima da pra ver que as referencias levam para o mesmo endereço objeto
	}
}
