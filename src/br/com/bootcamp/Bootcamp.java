package br.com.bootcamp;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class Bootcamp {
    private String nome;
    private String descricao;
    private LocalDate dataInicio;
    private LocalDate dataFim;
    private Set<Curso> cursos = new HashSet<>();
    private Set<Mentoria> mentorias = new HashSet<>();
    private Set<Dev> devsInscritos = new HashSet<>();

    public Bootcamp() {}

    public Bootcamp(String nome, String descricao, LocalDate dataInicio, LocalDate dataFim) {
        this.nome = nome;
        this.descricao = descricao;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
    }

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

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }

    public LocalDate getDataFim() {
        return dataFim;
    }

    public void setDataFim(LocalDate dataFim) {
        this.dataFim = dataFim;
    }

    public Set<Curso> getCursos() {
        return cursos;
    }

    public Set<Mentoria> getMentorias() {
        return mentorias;
    }

    public Set<Dev> getDevsInscritos() {
        return devsInscritos;
    }

    public void inscreverDev(Dev dev) {
        this.devsInscritos.add(dev);
    }
}

