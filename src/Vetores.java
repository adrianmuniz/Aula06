import java.util.Scanner;

public class Vetores {

	public static void main(String[] args) {
		double aluno[] = new double [10];
		double total =0;
		Scanner leitor = new Scanner (System.in);
		
		for (int i=0; i<aluno.length; i++) {
			System.out.println("Digite o consumo do aluno" + (i + 1));
			aluno[i] = leitor.nextDouble();
			total = aluno[i] + total;
		}
		for (int i=0; i<aluno.length; i++) {
			System.out.println("O aluno " + (i+1) + " consumiu R$" + aluno[i]);
		}
		
		System.out.println("O total de consumo foi de R$" + total);
		
		
		leitor.close();
		

	}

}
