

public class Conta {
	private double saldo; //privado não pode ser lido nem modificado em outra classe
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total; // static muda o total para a classe e não cada conta
	
	public Conta(int agencia, int numero) {
		Conta.total++;
		// System.out.println("o total de contas é " + Conta.total);
		this.agencia = agencia;
		this.numero = numero;
				
		System.out.println("Criando uma conta " + this.numero);
	}
	
	public void deposita(double valor) { //void = não devolve resposta
		this.saldo += valor;
	}
	
	public boolean saca(double valor) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		}
		return false;
		
	}
	
	public boolean transfere (double valor, Conta destino) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			destino.deposita(valor);
			return true;
		}
		return false;
	}
	
	public double getSaldo() { // setSaldo não precisa pois tem metodo de saca e deposita
		return this.saldo;
	}
	
	public int getNumero () {
		return this.numero;
	}
	
	public void setNumero(int numero){
		if(numero <= 0) {
			System.out.println("Nao pode valor <= 0");
			return;
		}
		this.numero = numero;
	}
	
	public int getAgencia() {
		return this.agencia;
	}
	
	public void setAgencia(int agencia) {
		if(agencia <= 0) {
			System.out.println("nao pode valor menor ou igual a 0");
			return;
		}
		this.agencia = agencia;
	}
	
	public Cliente getTitular() {
		return titular;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public static int getTotal () {
		return Conta.total;
	}
	
	
}
