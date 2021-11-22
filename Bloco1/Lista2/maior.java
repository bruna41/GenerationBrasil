package lista2;

import java.util.Scanner;

public class maior {

	public static void main(String[] args) {
		int num1, num2, num3, maior = 0, numM = 0;
		Scanner rec = new Scanner (System.in);
		System.out.println("Digite tr�s n�meros intiros: ");
		num1 = rec.nextInt();
		num2 = rec.nextInt();
		num3 = rec.nextInt();
		
		if (num1 > num2 && num1 > num3) {
			maior = num1;
		}else if (num2 > num1 && num2 > num3) {
			maior = num2;
		}else if (num3 > num1 && num3 > num2) {
			maior = num3;
		}
		System.out.println(maior);
	}

}
