package javacore.introducaometodos.classes;

//crie os seguintes atributos para essa classe: nome, matricula, rg, cpf
//crie uma classe de teste para preencher e imprimir os dados do professor.
public class Professor {

	public String nome;
	public int matricula;
	public String rg;
	public String cpf;
	
	public void imprime() {
		System.out.println("------------");
		System.out.println(this.nome);
		System.out.println(this.cpf);
		System.out.println(this.rg);
		System.out.println(this.matricula);
		
		
	}
}
