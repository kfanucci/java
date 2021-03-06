
public class Gerente extends Funcionario implements Autenticavel {  //extends faz herdar a classe Funcionario, assina contrato autenticavel
	
	private AutenticacaoUtil autenticador;
	
	public double getBonus() {
		System.out.println("Chamando o metedo bonus do GERENTE");
		return super.getSalario() ; //super sobe a hierarquia e busca na mae, reescrita
	}

	public Gerente () {
		this.autenticador = new AutenticacaoUtil();
	}
		
	
	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
	}
	
	@Override
	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);
	}
	
}	