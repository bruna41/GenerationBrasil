package POO2;

public class Pregui�a extends Animal {
	
	public boolean subir (boolean subindo) {
		if (subindo == true) {
			System.out.println("Subindo...");
		}else {
			System.out.println("Na sombra...");
		}
		return subindo;
	}

}
