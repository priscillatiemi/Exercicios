package javacore.introducaometodos.sobrecargametodos.teste;

import javacore.introducaometodos.sobrecargametodos.classes.Funcionario;

public class FuncionarioTeste {

	public static void main(String[] args) {
		
		Funcionario funcionario = new Funcionario();
		funcionario.init("Ana", "112233-44", 4500.00,"123123214");
		
		funcionario.imprime();
	}
}
