
public class TestaCondicional2 {

	public static void main(String[] args) {
		System.out.println("sysout + ctrl + espaço preenche tudo");
		int idade = 18;
		int quantidadePessoas = 3;
		boolean acompanhado = quantidadePessoas >= 2;
		
		System.out.println("Valor de acompanhado = " + acompanhado);
		
		if (idade >= 18 && acompanhado) { //se usar || é ou se usar && é e
			System.out.println("Seja bem vindo");
		} else {
			System.out.println("infelizmente você não pode entrar");
			}
	}

}