package javacore.introducaometodos.classes;

public class Estudante {

	private String nome;
	private int idade;
	private double[] notas;
	private boolean aprovado;
	
	public void imprimirNotas(double...medias) {
		System.out.println("Nome: "+this.nome);
		System.out.println("\nIdade: "+this.idade);
		
		if(notas!= null)
		for(double nota:this.notas) {
			System.out.print(nota+" ");
		}
	}
	public void tirarMedia() {
		if(this.notas==null) {
			System.out.println("\nEsse aluno não possui notas.");
			return;
		}
		double media = 0;
		for(double nota:this.notas) {
			media+=nota;
		}
		media = media/this.notas.length;
		
		if(media>6.0) {
			this.aprovado = true;
			System.out.println("\nA média é: "+media+" Aprovado");
		}else {
			this.aprovado = false;
			System.out.println("\nA média é: "+media+" Reprovado");
		}
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setIdade(int idade) {
		if(idade < 0) {
			System.out.println("voce nao pode fazer isso");
			return;
		}
		this.idade = idade;
	}
	
	public void setNotas(double[] notas) {
		this.notas = notas;
	}
	
	public String getNome() {
		return this.nome;
	}
	public int getIdade() {
		return this.idade;
	}
	
	public double[] getNotas() {
		return this.notas;
	}
	
	
	public boolean isAprovado() {
		return this.aprovado;
	}
	
}
