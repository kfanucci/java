
public class TestaValores {

	public static void main(String[] args) {
		Conta conta1 = new Conta(1, 001);
		
		Conta conta2 = new Conta(2, 002);
		
		Conta conta3 = new Conta(3, 003);
		
		conta1.deposita(100);
		conta2.deposita(500);
		conta3.deposita(50);
	 

		 System.out.println("conta1 com o saldo de: " + conta1.getSaldo());
		 System.out.println("conta2 com o saldo de: " + conta2.getSaldo());
		 System.out.println("conta3 com o saldo de: " + conta3.getSaldo());
		 
		 conta1.transfere(40, conta3);
		 conta2.transfere(600, conta3);
		 
		 System.out.println("conta1 com o saldo de: " + conta1.getSaldo());
		 System.out.println("conta2 com o saldo de: " + conta2.getSaldo());
		 System.out.println("conta3 com o saldo de: " + conta3.getSaldo());
		 
	}
	
}
