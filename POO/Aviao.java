package POO;

public class Aviao {
	
	private double valor;
	private double altura;
	private double tempo;
	
	public Aviao (double h, double t, double v) {
		valor = v;
		tempo = t;
		altura = h;
	}
	public double getAtributos () {
		double Atributos = altura + tempo + valor;
		return Atributos;
	}
	
}
