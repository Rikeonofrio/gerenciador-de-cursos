package br.com.alura.restaurante;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ListaRestaurante {


    public static void main(String[] args) {

        Restaurante p1 = new Restaurante("Strogofr", 22.00);
        Restaurante p2 = new Restaurante("Feijoada", 25.40);
        Restaurante p3 = new Restaurante("Parmegiana", 19.70);
        Restaurante p4 = new Restaurante("Costela", 30);

        ArrayList<Restaurante> restaurantes = new ArrayList<>();
        restaurantes.add(p1);
        restaurantes.add(p2);
        restaurantes.add(p3);
        restaurantes.add(p4);

        System.out.println(restaurantes);

        Collections.sort(restaurantes, Comparator.comparing(Restaurante::getNomeDaComida));

        System.out.println(restaurantes);


    }
}
