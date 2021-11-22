package lista3;

import java.util.Scanner;

public class soma {

	public static void main(String[] args) {
		int num, sT = 0;
		Scanner rec = new Scanner (System.in);	
		do {
			System.out.println("N�meros: ");
			num = rec.nextInt();
			sT += num;
		}while (num != 0);
		System.out.println(sT);
	}

}
