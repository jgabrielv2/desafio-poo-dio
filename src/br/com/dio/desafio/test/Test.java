package br.com.dio.desafio.test;

import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Test {
	public static void main(String[] args) {

		Curso javaOO = new Curso();
		javaOO.setTitulo("Java e Orientação a Objetos");
		javaOO.setDescricao("Orientação a Objetos com Java");
		javaOO.setCargaHoraria(130);

		Curso cSharpOO = new Curso();
		cSharpOO.setTitulo("C# e OO");
		cSharpOO.setDescricao("Programe com o c#");
		cSharpOO.setCargaHoraria(100);

		Mentoria mentoriaOne = new Mentoria();
		mentoriaOne.setTitulo("Primeira mentoria");
		mentoriaOne.setDescricao("Descricao da mentoria one");
		mentoriaOne.setData(LocalDate.now());

		Mentoria mentoriaTwo = new Mentoria();
		mentoriaTwo.setTitulo("Segunda mentoria");
		mentoriaTwo.setDescricao("Descrição da segunda mentoria");
		mentoriaTwo.setData(LocalDate.now());

		Bootcamp boot = new Bootcamp();
		boot.setNome("Java Developer");
		boot.setDescricao("Torne-se um poderoso Java Developer!");

		boot.getConteudos().add(javaOO);
		boot.getConteudos().add(cSharpOO);
		boot.getConteudos().add(mentoriaOne);
		boot.getConteudos().add(mentoriaTwo);

		Dev devJoao = new Dev();
		devJoao.setNome("João Gabriel");
		devJoao.inscreverNoBootcamp(boot);

		Dev devHelena = new Dev();
		devHelena.setNome("Baby Helena");
		devHelena.inscreverNoBootcamp(boot);

		System.out.println("Conteúdos inscritos joao: " + devJoao.getConteudosInscritos());
		System.out.println("Conteúdos concluidos joao: " + devJoao.getConteudosConcluidos());

		System.out.println("-----JOÃO PROGREDIU------");
		devJoao.progredir();

		System.out.println("Conteúdos inscritos joao: " + devJoao.getConteudosInscritos());
		System.out.println("Conteúdos concluidos joao: " + devJoao.getConteudosConcluidos());

		System.out.println("-----JOÃO PROGREDIU------");
		devJoao.progredir();

		System.out.println("Conteúdos inscritos joao: " + devJoao.getConteudosInscritos());
		System.out.println("Conteúdos concluidos joao: " + devJoao.getConteudosConcluidos());

		System.out.println("XP joao: " + devJoao.calcularTotalXp());

		System.out.println("----------");
		System.out.println("Conteúdos inscritos helena: " + devHelena.getConteudosInscritos());
		System.out.println("Conteúdos concluidos helena: " + devHelena.getConteudosConcluidos());

		System.out.println("-----helena PROGREDIU------");
		devHelena.progredir();

		System.out.println("Conteúdos inscritos helena: " + devHelena.getConteudosInscritos());
		System.out.println("Conteúdos concluidos helena: " + devHelena.getConteudosConcluidos());
		System.out.println("XP helena: " + devHelena.calcularTotalXp());
	}
}
