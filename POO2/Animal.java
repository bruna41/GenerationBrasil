package POO2;

public class Animal {
	
	private String nome;
	private int idade;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public boolean som (boolean s) {
		System.out.println("Som genérico.");
		return s;
	}
	public boolean correr (boolean correndo) {
		if (correndo == true) {
			System.out.println("Correndo...");
		}else {
			System.out.println("Parado...");
		}
		return correndo;
	}

}
