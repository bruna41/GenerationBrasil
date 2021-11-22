package lista1;

import java.util.Scanner;

public class evento {

	public static void main(String[] args) {
		int eventoS, horas, min;
		System.out.println("Escreva a dura��o do evento em segundos: ");
		Scanner ev = new Scanner (System.in);
		eventoS = ev.nextInt();
		horas = eventoS / 3600;
		min = eventoS / 60;
		System.out.println("A dura��o do evento em horas, minutos e segundos �: " + horas + ", " + min + ", " + eventoS);
	}

}
