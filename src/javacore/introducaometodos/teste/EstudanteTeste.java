package javacore.introducaometodos.teste;

import javacore.introducaometodos.classes.Estudante;
public class EstudanteTeste {

	public static void main(String[] args) {

		Estudante estudante = new Estudante();
		
		estudante.setNome("Tiemi");
		estudante.setIdade(-1);
		estudante.setNotas(new double[] {3.0,2.0,5.5});
		
		estudante.imprimirNotas();
		estudante.tirarMedia();
		System.out.println("Aprovação: "+estudante.isAprovado());
		
		System.out.println(estudante.getNome());
	}

}
