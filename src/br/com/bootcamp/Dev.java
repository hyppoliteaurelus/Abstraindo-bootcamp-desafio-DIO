package br.com.bootcamp;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class Dev {
    private String nome;
    private Set<Curso> cursosInscritos = new HashSet<>();
    private Set<Mentoria> mentoriasInscritas = new HashSet<>();
    private Set<Curso> cursosConcluidos = new HashSet<>();
    private Set<Mentoria> mentoriasConcluidas = new HashSet<>();
    private Set<Recompensa> recompensas = new HashSet<>();
    private Set<Certificado> certificados = new HashSet<>();

    public Dev() {}

    public Dev(String nome) {
        this.nome = nome;
    }

    // Getters e setters


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Curso> getCursosInscritos() {
        return cursosInscritos;
    }

    public void setCursosInscritos(Set<Curso> cursosInscritos) {
        this.cursosInscritos = cursosInscritos;
    }

    public Set<Mentoria> getMentoriasInscritas() {
        return mentoriasInscritas;
    }

    public void setMentoriasInscritas(Set<Mentoria> mentoriasInscritas) {
        this.mentoriasInscritas = mentoriasInscritas;
    }

    public Set<Curso> getCursosConcluidos() {
        return cursosConcluidos;
    }

    public void setCursosConcluidos(Set<Curso> cursosConcluidos) {
        this.cursosConcluidos = cursosConcluidos;
    }

    public Set<Mentoria> getMentoriasConcluidas() {
        return mentoriasConcluidas;
    }

    public void setMentoriasConcluidas(Set<Mentoria> mentoriasConcluidas) {
        this.mentoriasConcluidas = mentoriasConcluidas;
    }

    public Set<Recompensa> getRecompensas() {
        return recompensas;
    }

    public void setRecompensas(Set<Recompensa> recompensas) {
        this.recompensas = recompensas;
    }

    public Set<Certificado> getCertificados() {
        return certificados;
    }

    public void setCertificados(Set<Certificado> certificados) {
        this.certificados = certificados;
    }

    public void inscreverCurso(Curso curso) {
        this.cursosInscritos.add(curso);
    }

    public void inscreverMentoria(Mentoria mentoria) {
        this.mentoriasInscritas.add(mentoria);
    }

    public void concluirCurso(Curso curso) {
        if (this.cursosInscritos.contains(curso)) {
            this.cursosConcluidos.add(curso);
            this.cursosInscritos.remove(curso);
            adicionarRecompensa(new Recompensa("Concluiu o curso: " + curso.getTitulo()));
            emitirCertificado(curso.getTitulo());
        }
    }

    public void concluirMentoria(Mentoria mentoria) {
        if (this.mentoriasInscritas.contains(mentoria)) {
            this.mentoriasConcluidas.add(mentoria);
            this.mentoriasInscritas.remove(mentoria);
            adicionarRecompensa(new Recompensa("Concluiu a mentoria: " + mentoria.getTitulo()));
            emitirCertificado(mentoria.getTitulo());
        }
    }

    private void adicionarRecompensa(Recompensa recompensa) {
        this.recompensas.add(recompensa);
    }

    private void emitirCertificado(String titulo) {
        this.certificados.add(new Certificado(titulo, this.nome, LocalDate.now()));
    }

    public double calcularProgresso() {
        int totalCursos = cursosInscritos.size() + cursosConcluidos.size();
        int totalMentorias = mentoriasInscritas.size() + mentoriasConcluidas.size();
        int totalConcluidos = cursosConcluidos.size() + mentoriasConcluidas.size();

        if (totalCursos + totalMentorias == 0) return 0;

        return (double) totalConcluidos / (totalCursos + totalMentorias) * 100;
    }

    public void exibirProgresso() {
        System.out.println("Desenvolvedor: " + nome);
        System.out.println("Cursos Inscritos: " + cursosInscritos.size());
        System.out.println("Mentorias Inscritas: " + mentoriasInscritas.size());
        System.out.println("Cursos Concluídos: " + cursosConcluidos.size());
        System.out.println("Mentorias Concluídas: " + mentoriasConcluidas.size());
        System.out.println("Recompensas: ");
        for (Recompensa recompensa : recompensas) {
            System.out.println(" - " + recompensa.getDescricao());
        }
        System.out.println("Certificados: ");
        for (Certificado certificado : certificados) {
            System.out.println(" - " + certificado.getTitulo() + " emitido em " + certificado.getDataEmissao());
        }
        System.out.println("Progresso: " + calcularProgresso() + "%");
    }
}

