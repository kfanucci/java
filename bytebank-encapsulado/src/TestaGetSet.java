
public class TestaGetSet {

	public static void main(String[] args) {
		Conta conta = new Conta(1337, 24266);
		
		System.out.println(conta.getNumero());
		
		Cliente paulo = new Cliente ();
		
		paulo.setNome("Paulo Silveira");
		
		conta.setTitular(paulo);
		System.out.println(conta.getTitular());
		System.out.println(conta.getTitular().getNome());
		
		conta.getTitular().setProfissao("programador");
	}
}
