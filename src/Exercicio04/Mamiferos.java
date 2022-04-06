package Exercicio04;


public class Mamiferos extends Animal{
	
	@Override
	public void locomover() {
		System.out.println("Mamiferos: Andar");
		
	}
	@Override 
	public void alimentar() {
		System.out.println("Mamiferos: Alimentar mix de Carne e Vegetais");
	}
	

}