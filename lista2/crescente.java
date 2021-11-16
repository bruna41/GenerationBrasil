package lista2;

import java.util.Scanner;

public class crescente {

	public static void main(String[] args) {
		int n1, n2, n3;
		System.out.println("Três inteiros: ");
		Scanner cres = new Scanner (System.in);
		n1 = cres.nextInt();
		n2 = cres.nextInt();
		n3 = cres.nextInt();
		if (n1 < n2 && n2 < n3) {
			System.out.println(n2 + "-" + n1 + "-" + n3);
		}else if (n2 < n1 && n1 < n3) {
			System.out.println(n1 + "-" + n2 + "-" + n3);
		}else if (n3 < n2 &&  n1 < n2) {
			System.out.println(n3 + "-" + n2 + "-" + n1);
		}
	}

}
