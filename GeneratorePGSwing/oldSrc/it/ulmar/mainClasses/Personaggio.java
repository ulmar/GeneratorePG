package it.ulmar.mainClasses;

public class Personaggio {
	
	private String nome;
	private Classe classe;
	
	public Personaggio(String nome, Classe classe) {
		this.nome = nome;
		this.classe = classe;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Classe getClasse() {
		return classe;
	}

	public void setClasse(Classe classe) {
		this.classe = classe;
	}

}
