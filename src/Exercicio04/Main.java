package Exercicio04;

public class Main {

	public static void main(String[] args) {
		Aves ave = new Aves();
		Repteis reptil = new Repteis();
		Mamiferos mamifero = new Mamiferos();
		Anfibios anfibio = new Anfibios();
		
		anfibio.locomover();
		anfibio.alimentar();
		reptil.locomover();
		reptil.alimentar();
		mamifero.locomover();
		mamifero.alimentar();		
		ave.locomover(); 
		ave.alimentar();

		

	}

}