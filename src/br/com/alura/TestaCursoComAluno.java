package br.com.alura;

public class TestaCursoComAluno {
    public static void main(String[] args) {
        Curso javaColecoes = new Curso("Curso coleçoes",
                "paulo");

        javaColecoes.adiciona(new Aula("Trabalhndo com array list ", 21));
        javaColecoes.adiciona(new Aula("Criando uma aula ", 20));
        javaColecoes.adiciona(new Aula("modelando com coleçoes", 24));

        Aluno a1 = new Aluno("Rodrigo Turini", 34672);
        Aluno a2 = new Aluno("Guilherme Silveira", 5617);
        Aluno a3 = new Aluno("Mauricio Aniche", 17645);

        javaColecoes.matricular(a1);
        javaColecoes.matricular(a2);
        javaColecoes.matricular(a3);

        System.out.println("todos matriculador neste curso");
        javaColecoes.getAlunos().forEach(a -> {
            System.out.println(a);
        });

        System.out.println("O aluno " + a1 + "esta matriculado?");
        System.out.println(javaColecoes.estaMatriculado(a1));


        Aluno turini = new Aluno("Rodrigo Turini", 34672);
        System.out.println("e este Turini, esta matriculado ? ");
        System.out.println(javaColecoes.estaMatriculado(turini));

        System.out.println("O a1 é equals ao Turini");
        System.out.println(a1.equals(turini));


        System.out.println(a1.hashCode() == turini.hashCode());
    }
}
