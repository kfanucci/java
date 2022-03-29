
public class TestaCondiconal {

	public static void main(String[] args) {
		System.out.println("sysout + ctrl + espaço preenche tudo");
		int idade = 18;
		int quantidadePessoas = 3;
		if (idade >= 18) {
			System.out.println("Voce tem mais de 18 anos");
			System.out.println("Seja bem vindo");
		} else {
			System.out.println("infelizmente você não pode entrar");
			if(quantidadePessoas >= 2) {
				System.out.println("Voce não tem 18, mas pode entrar "
						+ "pois está acompanhado");
			} else {
				System.out.println("Voce não tem 18 e nem está acompanhado");
			}
		}

	}
}
