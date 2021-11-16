package lista1;

import java.util.Scanner;

public class evento {

	public static void main(String[] args) {
		int eventoS, horas, min;
		System.out.println("Escreva a duração do evento em segundos: ");
		Scanner ev = new Scanner (System.in);
		eventoS = ev.nextInt();
		horas = eventoS / 3600;
		min = eventoS / 60;
		System.out.println("A duração do evento em horas, minutos e segundos é: " + horas + ", " + min + ", " + eventoS);
	}

}
