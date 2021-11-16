package lista4;

import java.util.Scanner;

public class vetor {

	public static void main(String[] args) {
		int notas, med = 0, m, soma = 0;
		Scanner ler = new Scanner (System.in);
		for (m=0; m<5; m++) {
			int[] media = new int [4];
			System.out.println("Digite nota " + m + ": ");
			notas = ler.nextInt();
			soma += notas;
			med = soma / 4;	
		} 
		System.out.println(m + "/" + med);
	}

}
