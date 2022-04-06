package Exercicio04;


public class Anfibios extends Animal {
	
	@Override
	public void locomover() {
		System.out.println("Anfibios: Andar ou Nadar");
	}
	
	@Override 
	public void alimentar() {
		System.out.println("Anfibios: Alimentar com Vegetais");
	}
}

