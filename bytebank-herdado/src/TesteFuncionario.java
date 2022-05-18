
public class TesteFuncionario {

	public static void main(String[] args) {
		
		Funcionario nico = new Gerente();
		nico.setNome("Nico Steppot");
		nico.setSalario(2600.00);
		nico.setCpf("223355646-9");
		
		System.out.println(nico.getNome());
		System.out.println(nico.getBonus());
		
		// gerente abaixo
		
		Gerente g1 = new Gerente();
		
		g1.setNome("Ze");
		g1.setCpf("44311614820");
		g1.setSalario(3500);
		
		System.out.println(g1.getNome());
		System.out.println(g1.getCpf());
		System.out.println(g1.getSalario());
		
		g1.setSenha(5560);
		boolean autentica = g1.autentica(5560);
		
		System.out.println(autentica);
		
		System.out.println(g1.getBonus());
		

	}

}
