package POO2;

public class Cavalo extends Animal {
	
	@Override
    public void correr () {
        System.out.println("Correndo");
    }

	@Override
	public void som() {
		System.out.println("Relincha...");
		
	}
}
