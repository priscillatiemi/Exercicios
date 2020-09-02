package javacore.introducaoclasses.test;

import javacore.introducaoclasses.classes.Professor;
//crie os seguintes atributos para essa classe: nome, matricula, rg, cpf
//crie uma classe de teste para preencher e imprimir os dados do professor.
public class ProfessorTeste {

	public static void main(String[] args) {

		Professor professor = new Professor();
		
		professor.nome = "Giovane";
		professor.matricula  = 1414;
		professor.rg = "223343";
		professor.cpf = "237123";
		
		Professor professor2 = new Professor();
		professor2.cpf="2223333";
		professor2.nome = "Jurandir";
		professor2.rg="12311";
		professor2.matricula=2222;
		
		System.out.println(professor.nome);
		System.out.println(professor.matricula);
		System.out.println(professor.rg);
		System.out.println(professor.cpf);
		
		System.out.println("--------------");
		

		System.out.println(professor2.nome);
		System.out.println(professor2.matricula);
		System.out.println(professor2.rg);
		System.out.println(professor2.cpf);
		

	}

}
