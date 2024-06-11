package br.com.bootcamp;

import java.time.LocalDate;

public class Certificado {
    private String titulo;
    private String nomeDev;
    private LocalDate dataEmissao;

    public Certificado(String titulo, String nomeDev, LocalDate dataEmissao) {
        this.titulo = titulo;
        this.nomeDev = nomeDev;
        this.dataEmissao = dataEmissao;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getNomeDev() {
        return nomeDev;
    }

    public void setNomeDev(String nomeDev) {
        this.nomeDev = nomeDev;
    }

    public LocalDate getDataEmissao() {
        return dataEmissao;
    }

    public void setDataEmissao(LocalDate dataEmissao) {
        this.dataEmissao = dataEmissao;
    }
}

