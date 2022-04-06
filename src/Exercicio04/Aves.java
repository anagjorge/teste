package Exercicio04;

public class Aves extends Animal{
	
	@Override
	public void locomover() {
		System.out.println("Aves: Voar");
		
	}
	@Override 
	public void alimentar() {
		System.out.println("Aves: Alimentar mix de Carne e Vegetais");
	}
	

}
