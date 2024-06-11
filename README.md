# Bootcamp Java Developer

Bem-vindos ao desafio: APRENDENDO NA PRÁTICA O PARADIGMA DE ORIENTAÇÃO A OBJETOS. Este projeto foi co-criado com a plataforma de cursos online DIGITAL INNOVATION ONE 💛🧡 e disponibilizado de forma gratuita para a comunidade dos desenvolvedores Java.

## Objetivo

O objetivo principal é colocar em prática umas das principais ferramentas da Orientação a Objetos (OO): Abstração, Encapsulamento, Herança e Polimorfismo, através de um projeto Java.

## Pré-Requisitos

- Conhecer a sintaxe da Java
- Java JDK 11
- IDE para desenvolvimento Java (recomendado: IntelliJ IDEA)
- Git
- Conta no GitHub

## Passo-a-Passo

1. Abstrair o domínio Bootcamp e modelar seus atributos e métodos.
2. Criar as classes: Bootcamp, Cursos, Mentorias e Devs e relacioná-las.
3. Modelar as classes Curso, Mentoria e Devs, ou seja, criar seus atributos e métodos.
4. Utilizar as ferramentas da OO: Abstração, Encapsulamento, Herança e Polimorfismo para tornar o código mais legível e de fácil manutenção.
5. Transformar as classes criadas e relacionadas em objetos.

## Funcionalidades Adicionadas

- Persistência de dados em CSV.
- Inscrição e conclusão manual de cursos e mentorias.
- Interação detalhada no console para melhor experiência do usuário.

## Estrutura do Projeto

### Classes Principais

- **Bootcamp**: Representa o bootcamp com cursos e mentorias.
- **Curso**: Representa um curso com título, descrição e carga horária.
- **Mentoria**: Representa uma mentoria com título, descrição e data.
- **Dev**: Representa um desenvolvedor inscrito no bootcamp.
- **Persistencia**: Responsável por salvar e carregar dados dos desenvolvedores em um arquivo CSV.

### Métodos Importantes

- **inscreverDev(Bootcamp bootcamp)**: Inscreve um desenvolvedor no bootcamp.
- **listarDevs()**: Lista todos os desenvolvedores e seu progresso.
- **salvarDados(Set<Dev> devs, String fileName)**: Salva os dados dos desenvolvedores em um arquivo CSV.
- **carregarDados(String fileName)**: Carrega os dados dos desenvolvedores de um arquivo CSV.
- **inscreverCurso(Curso curso)**: Inscreve um desenvolvedor em um curso.
- **concluirCurso(Curso curso)**: Marca um curso como concluído pelo desenvolvedor.

## Como Executar

1. Clone o repositório:

```bash
git clone https://github.com/seu-usuario/bootcamp-java-developer.git
cd bootcamp-java-developer
