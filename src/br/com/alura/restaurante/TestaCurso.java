package br.com.alura.restaurante;


import br.com.alura.Aula;
import br.com.alura.Curso;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestaCurso {
    public static void main(String[] args) {
        Curso javaColecoes = new Curso("Curso coleçoes",
                "paulo");

        javaColecoes.adiciona(new Aula("Trabalhndo com array list ", 21));
        javaColecoes.adiciona(new Aula("Criando uma aula ", 20));
        javaColecoes.adiciona(new Aula("modelando com coleçoes", 24));

        List<Aula> aulasImutaves = javaColecoes.getAulas();
        System.out.println(aulasImutaves);

        List<Aula> aulas = new ArrayList<>(aulasImutaves);

        Collections.sort(aulas);
        System.out.println(aulas);
//        System.out.println(javaColecoes.getTempoTotaL());
//
//
//
//        System.out.println(javaColecoes);
    }
}
