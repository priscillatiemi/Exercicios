package javacore.introducaometodos.teste;

import javacore.introducaometodos.classes.Professor;;
public class ProfessorTeste {

	public static void main(String[] args) {

		Professor professor = new Professor();
		professor.cpf="12321";
		professor.rg="3234";
		professor.matricula=333;
		professor.nome="Julio";
		
		Professor professor2 = new Professor();
		professor2.cpf="44444";
		professor2.rg="3232224";
		professor2.matricula=777;
		professor2.nome="Amanda";
		
		professor.imprime();
		professor2.imprime();
		
		
	}

}
