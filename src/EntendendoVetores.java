import java.util.Scanner;

import javax.swing.JOptionPane;

public class EntendendoVetores {

	public static void main(String[] args) {
		Scanner leitor = new Scanner (System.in);
		int[] vetorA = new int[30]; // cria��o do vetor
		int vetorB[] = new int [30];
		int vetorC[] = {1,2,7,6,13,28};
		
		//atribui��o do valor manualmente 
		vetorA[0] = 50;
		vetorA[1] = 99;
		
		//exibi��o de valores indicando o indice manualmente
		System.out.println(vetorA[0]);
		//atribui��o de valores usando um loop
		for(int i=0; i<vetorA.length; i++) {
			vetorA[i] = Integer.parseInt(JOptionPane.showInputDialog("insira um valor"));
		}
		
		//exibi��o dos valores com loop
		for(int i=0; i<vetorA.length; i++) {
			System.out.println(vetorA[i]);
		}
		
		leitor.close();
	}

}
