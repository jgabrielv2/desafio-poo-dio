package br.com.dio.desafio.dominio;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public class Bootcamp {
	private String nome;
	private String descricao;
	private final LocalDate dataInicial = LocalDate.now();
	private final LocalDate dataFinal = dataInicial.plusDays(45);

	private Set<Dev> devs = new HashSet<>();
	private List<Mentoria> mentorias;
	private Set<Conteudo> conteudos = new LinkedHashSet<>();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public LocalDate getDataInicial() {
		return dataInicial;
	}

	public LocalDate getDataFinal() {
		return dataFinal;
	}

	public Set<Dev> getDevs() {
		return devs;
	}

	public void setDevs(Set<Dev> devs) {
		this.devs = devs;
	}

	public List<Mentoria> getMentorias() {
		return mentorias;
	}

	public void setMentorias(List<Mentoria> mentorias) {
		this.mentorias = mentorias;
	}

	public Set<Conteudo> getConteudos() {
		return conteudos;
	}

	public void setConteudos(Set<Conteudo> conteudos) {
		this.conteudos = conteudos;
	}

	@Override
	public int hashCode() {
		return Objects.hash(conteudos, dataFinal, dataInicial, descricao, devs, mentorias, nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bootcamp other = (Bootcamp) obj;
		return Objects.equals(conteudos, other.conteudos) && Objects.equals(dataFinal, other.dataFinal)
				&& Objects.equals(dataInicial, other.dataInicial) && Objects.equals(descricao, other.descricao)
				&& Objects.equals(devs, other.devs) && Objects.equals(mentorias, other.mentorias)
				&& Objects.equals(nome, other.nome);
	}

	@Override
	public String toString() {
		return "Bootcamp [nome=" + nome + ", descricao=" + descricao + "]";
	}

}
