import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner (System.in);
		
		String atividades[] = new String[5];
		int ordem = 0;
		
		for (int i=0; i<atividades.length; i++) {
			System.out.print("Digite a " + (i+1) + " atividade feita no seu dia!: ");
			atividades[i] = leitor.nextLine();
		}
		
		System.out.println("Escolha 1 para exibir as atividades em Ordem e 2 para exibir em Ordem Reversa");
		ordem = leitor.nextInt();
		
		switch (ordem) {
		case 1:
			for (int i=0; i<atividades.length; i++) {
				System.out.println(atividades[i]);
			}
			break;
		case 2:
			for (int i =atividades.length - 1; i >=0; i--) {
				System.out.println(atividades[i]);
			}
			break;
		default:
			System.out.println("Opção inválida");
			break;
		}	
			
		leitor.close();
	}

}
