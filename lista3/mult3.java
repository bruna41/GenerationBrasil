package lista3;

import java.util.Scanner;

public class mult3 {

	public static void main(String[] args) {
		int num, m=0, soma = 0, media;
		Scanner rec = new Scanner (System.in);	
		do {
			System.out.println("Números: ");
			num = rec.nextInt();
			if (num%3 == 0){
				soma += num;
				m++;	
			}
			media = soma / m;
		}while (num != 0);
		System.out.println(media);
	}

}
