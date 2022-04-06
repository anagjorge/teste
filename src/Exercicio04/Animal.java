package Exercicio04;

public class Animal implements AcoesAnimal {
	
	public String classe;
    public String alimentacao;
    public String habitat; 
	
	@Override
	public void locomover() {
		
	}
	@Override
	public void alimentar() {
		
	}
	public String getClasse() {
		return classe;
	}
	public void setClasse(String classe) {
		this.classe = classe;
	}
	public String getAlimentacao() {
		return alimentacao;
	}
	public void setAlimentacao(String alimentacao) {
		this.alimentacao = alimentacao;
	}
	public String getHabitat() {
		return habitat;
	}
	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}
	

}

