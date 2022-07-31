package br.com.dio.desafio.test;

import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Test {
	public static void main(String[] args) {
		Dev joao = new Dev();
		joao.setNome("João Gabriel");

		Curso javaOO = new Curso();
		javaOO.setTitulo("Java e Orientação a Objetos");
		javaOO.setDescricao("Orientação a Objetos com Java");
		javaOO.setCargaHoraria(130);

		Mentoria mentoriaOne = new Mentoria();
		Curso cSharpOO = new Curso();
		Mentoria mentoriaTwo = new Mentoria();

	}
}
