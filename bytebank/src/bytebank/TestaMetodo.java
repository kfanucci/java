package bytebank;

public class TestaMetodo {

		public static void main(String[] args) {
			Conta contaNelson = new Conta();
			contaNelson.saldo = 100;
			contaNelson.deposita(50);
			System.out.println(contaNelson.saldo);
			
			boolean conseguiuRetirar = contaNelson.saca(20);
			System.out.println(contaNelson.saldo);
			System.out.println(conseguiuRetirar);
			
			Conta contaMarcos = new Conta();
			contaMarcos.deposita(1000);
			
			boolean sucessoTransferencia = 
					contaMarcos.transfere(300, contaNelson);
			if(sucessoTransferencia) {
				System.out.println("Transferido com sucesso");
			} else {
				System.out.println("Saldo insuficiente");
			}
			
			System.out.println(contaMarcos.saldo);
			System.out.println(contaNelson.saldo);
		}
		
}
