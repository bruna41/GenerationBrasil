package lista1;

import java.util.Scanner;

public class idadeEmAMD {

	public static void main(String[] args) {
		int idadeD, idadeA, idadeM;
		System.out.print("Digite sua idade em dias: ");
		Scanner id = new Scanner (System.in);
		idadeD = id.nextInt();
		
		idadeA =  idadeD / 365;
		idadeM = (idadeD % 365) / 30;
		
		System.out.println("Sua idade em anos, meses e dias é, respectivamente: " + idadeA + ", " + idadeM + ", " + idadeD);
	}

}
