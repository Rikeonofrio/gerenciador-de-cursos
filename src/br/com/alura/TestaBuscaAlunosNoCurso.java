package br.com.alura;

import java.util.Map;
import java.util.Set;

public class TestaBuscaAlunosNoCurso {
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

        System.out.println("Quem é o aluno com o numero de matricula 5617");
        Aluno aluno = javaColecoes.buscaMatriculado(5617);
        System.out.println("aluno: " + aluno);

        Map<Integer, Set<Aluno>> matriculaParaAlunos;
    }
}
