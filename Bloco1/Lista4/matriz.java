package lista4;

import java.util.Scanner;

public class matriz {

	public static void main(String[] args) {
		int med = 0, a, n = 0, soma = 0;
		int [][] notas = new int [3][4];
		Scanner ler = new Scanner (System.in);
		for (a=0; a<3; a++) {
			for (n=0; n<4; n++) {
				System.out.print("Digite aluno " + a + " nota " + n + ": ");
				notas[a][n] = ler.nextInt();
				soma += notas[a][n];
			}
		}
		for (a=0; a<3; a++) {
				med = soma / 4;
				System.out.print("\nAluno " + a + " m�dia " + med);
		}
	
	
	}

}
