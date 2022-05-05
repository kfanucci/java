package teste;

public class prova1 {
	
	Scanner ler = new Scanner(System.in);

    //Dados do aluno
    String nome = "Enzo Eiji Hashizume";
    int RA = 1251113696;
    String UC = "Programação de Soluções Computacionais";
    String Turma = "SIN1AM-APB";

    //variaveis para controle
    int senhaSist = 170603;
    int senhaUsuario = 0;
    int Menu = 0; 
    int senhaErrada = 0;

    //condicionais para verificação e controle
    do{ System.out.print("Digite a senha: ");
    senhaUsuario = ler.nextInt();

    if(senhaUsuario == senhaSist) {
        System.out.println("Senha correta!");
        System.out.println("Quais dados você quer visualizar? (1-Nome, 2-RA, 3-UC, 4-Turma)");

    Menu = ler.nextInt();

    if (Menu == 1) {
        System.out.println("Nome: " + nome);
    } 
    else if (Menu == 2) {
        System.out.println("RA: " + RA);
    } 
    else if (Menu == 3) {
        System.out.println("Unidade Curricular: " + UC);
    } 
    else if (Menu == 4) {
        System.out.println("Turma: " + Turma);
    } 
    else {
        System.out.println("Resposta inválida");
    }
        System.exit(0);
    } 
    else {
        System.out.println("A senha está Incorreta!");
    senhaErrada++;
    }
} 
    while (senhaErrada<3);
        System.out.println("Você digitou incorretamente a senha por 3 vezes.");
    }
}

}
