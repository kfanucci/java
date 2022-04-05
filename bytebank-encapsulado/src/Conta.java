

public class Conta {
	private double saldo; //privado não pode ser lido nem modificado em outra classe
	private int agencia;
	private int numero;
	private Cliente titular;
	
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
		this.numero = numero;
	}
	
	public int getAgencia() {
		return this.agencia;
	}
	
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	
	public Cliente getTitular() {
		return titular;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	
}
