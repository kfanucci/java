

public class Conta {
	private double saldo; //privado não pode ser lido nem modificado em outra classe
	int agencia;
	int numero;
	Cliente titular;
	
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
}
