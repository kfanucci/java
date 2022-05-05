
public class TesteReferencias {

	public static void main(String[] args) {
		
		Funcionario g1 = new Gerente();
		Designer d = new Designer();
		g1.setNome("Marcos");
		String nome = g1.getNome();
		
		
		g1.setSalario(5000.0);
		d.setSalario(5000.0);
		
		
		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(g1);
		controle.registra(d);
		
		
		System.out.println(nome);
		System.out.println(controle.getSoma());
	}

}
