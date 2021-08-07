import java.util.Scanner;

public class Ex02 {

	public static final int QUANTIDADE_DE_ALUNOS = 5;
	public static void main(String[] args) {
		Scanner leitor = new Scanner (System.in);
		double media =0;
		double notas[] = new double[QUANTIDADE_DE_ALUNOS];
		String nomes[] = new String[QUANTIDADE_DE_ALUNOS];
		
		for (int i=0; i<notas.length; i++) {
			System.out.print("informe a nota do " + (i+1) + "º aluno: ");
			notas[i] = leitor.nextDouble();
			
			System.out.print("Informe o nome do " + (i+1) + "º aluno: ");
			nomes[i] = leitor.nextLine();
			leitor.nextLine();
			System.out.println();	
		}
		
		for (int i=0; i<notas.length; i++) {
			media = media + notas[i];
		}
		media = media / nomes.length;
		for (int i=0; i<nomes.length; i++) {
			if (notas[i] < media) {
				System.out.println("Chamar o aluno " + nomes[i] + " para conversar! A nota dele foi " + notas[i] + " e a média da turma foi " + media);
			}
		}
		
		leitor.close();
	}

}
