package br.com.alura;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class TestaAlunos {
    public static void main(String[] args) {
        Collection<String> alunos = new HashSet<>();

        alunos.add("Rodrigo Turine");
        alunos.add("alberto souza");
        alunos.add("nice Steppat");
        alunos.add("sergio lopez");
        alunos.add("renan Saggio");
        alunos.add("mauricio Aniche");

        boolean pauloEstaMatriculado = alunos.contains("Paulo Silveira");
        System.out.println(pauloEstaMatriculado);


        for (String aluno: alunos) {
            System.out.println(aluno);
        }


        System.out.println(alunos);





    }
}
