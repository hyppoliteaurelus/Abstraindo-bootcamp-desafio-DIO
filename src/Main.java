import br.com.bootcamp.*;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static Set<Dev> devs = new HashSet<>();

    public static void main(String[] args) {
        Bootcamp bootcamp = new Bootcamp("Bootcamp Java Developer", "Descrição do Bootcamp Java Developer", LocalDate.now(), LocalDate.now().plusDays(45));

        Curso curso1 = new Curso("Curso de Java", "Aprenda Java do básico ao avançado", 8);
        Curso curso2 = new Curso("Curso de Spring Boot", "Aprenda Spring Boot do básico ao avançado", 10);

        Mentoria mentoria1 = new Mentoria("Mentoria de Java", "Tire suas dúvidas sobre Java", LocalDate.now());

        bootcamp.getCursos().add(curso1);
        bootcamp.getCursos().add(curso2);
        bootcamp.getMentorias().add(mentoria1);

        while (true) {
            System.out.println("1. Inscrever Dev");
            System.out.println("2. Listar Devs");
            System.out.println("3. Salvar Dados");
            System.out.println("4. Carregar Dados");
            System.out.println("5. Sair");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    inscreverDev(bootcamp);
                    break;
                case 2:
                    listarDevs();
                    break;
                case 3:
                    Persistencia.salvarDados(devs, "dados.csv");
                    System.out.println("Dados salvos com sucesso!");
                    break;
                case 4:
                    devs = Persistencia.carregarDados("dados.csv");
                    System.out.println("Dados carregados com sucesso!");
                    break;
                case 5:
                    System.exit(0);
            }
        }
    }

    private static void inscreverDev(Bootcamp bootcamp) {
        System.out.println("Nome do Dev: ");
        String nome = scanner.nextLine();
        Dev dev = new Dev(nome);
        devs.add(dev);
        bootcamp.inscreverDev(dev);
        System.out.println("Dev inscrito com sucesso!");

        // Inscrever dev em cursos e mentorias
        for (Curso curso : bootcamp.getCursos()) {
            dev.inscreverCurso(curso);
        }
        for (Mentoria mentoria : bootcamp.getMentorias()) {
            dev.inscreverMentoria(mentoria);
        }

        dev.exibirProgresso();
    }

    private static void listarDevs() {
        for (Dev dev : devs) {
            dev.exibirProgresso();
            System.out.println("----------------------------");
        }
    }
}
