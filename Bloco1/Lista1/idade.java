package lista1;

import java.util.Scanner;

public class idade {

	public static void main(String[] args) {
		int idadeA, idadeM, idadeD;
		
		System.out.print("Digite sua idade em anos: ");
		Scanner leia = new Scanner (System.in);
		idadeA = leia.nextInt();
		
		System.out.print("Digite sua idade em meses: ");
		Scanner leia1 = new Scanner (System.in);
		idadeM = leia1.nextInt();
		
		System.out.print("Digite sua idade em dias: ");
		Scanner leia2 = new Scanner (System.in);
		idadeD = leia2.nextInt();
		
		System.out.print("Digite sua idade em dias: " + idadeD);
	}

}
