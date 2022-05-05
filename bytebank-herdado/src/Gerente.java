
public class Gerente extends Funcionario { //extends faz herdar a classe Funcionario
	 
	private int senha;
	
	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	public boolean autentica(int senha) {
		if(this.senha == senha) {
			return true;
		} else {
			return false;
		}
	}
	
	public Gerente() {
		
	}
	
	
	public double getBonus() {
		System.out.println("Chamando o metedo bonus do GERENTE");
		return super.getBonus() + super.getSalario() ; //super sobe a hierarquia e busca na mae, reescrita
	} 
	
}	