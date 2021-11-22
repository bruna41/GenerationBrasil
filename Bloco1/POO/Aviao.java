package POO;

public class Aviao {
	
	private double velocidade;
	private double altura;
	private double tempo;
	
	public Aviao (double h, double t, double v) {
		velocidade = v;
		tempo = t;
		altura = h;
	}
	public double getAtributos () {
		double Atributos = altura*tempo/velocidade;
		return Atributos;
	}
	
}
