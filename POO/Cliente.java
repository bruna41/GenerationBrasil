package POO;

public class Cliente {
	
	private double valor;
	private double desc;
	private double desconto;
	
	public Cliente (double valor, double desc) {
		desconto = valor - desc;
	}

	public double getDesconto() {
		return desconto;
	}

}
