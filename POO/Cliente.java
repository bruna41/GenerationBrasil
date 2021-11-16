package POO;

public class Cliente {
	
	private String nome;
	private double valor;
	private double desc;
	private double desconto;
	
	public Cliente (String name, double valor, double desc) {
		nome = name;
		desconto = valor - desc;
	}

	public String getNome () {
		return nome;
	}
	
	public double getDesconto() {
		return desconto;
	}

}
