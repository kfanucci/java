
public abstract class Funcionario { //abstract torna  classe abstrata
	 
	private String nome;
	private String cpf;
	private double salario; //protected privado porem publico para os filhos
	
	public Funcionario() {
		
	}
	
	
	public abstract double getBonus(); // metodo abstrato, n há implementação de metodos aqui  obriga os filhos a colocar metodo
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
	
	
}
