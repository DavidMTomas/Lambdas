package org.simarro;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MakigasStreams {
    public static void main(String[] args) {
        //https://www.youtube.com/watch?v=p211H0CL8Rs&t=518s

        // skip saltar elementos


        List<String> continentes= Arrays.asList("America","Oceania","Europa","Africa","Asia"); // puedevariar de tamaño, coleccion dinamica
        var continente= Arrays.asList("America","Oceania","Europa","Africa","Asia"); // El compilador infiere en el tipo
        String conti[]={"America","Oceania","Europa","Africa","Asia"}; // Tamaño fijo


        // imprmir

        System.out.println("Con stream");
        continentes.stream().forEach(System.out::println);


        System.out.println("Con metodo");
        System.out.println(Arrays.toString(continentes.toArray()));


        //saltar
        continentes.stream().skip(2).forEach(System.out::println);
        Arrays.stream(conti).skip(1).forEach(System.out::println);


        //limit
        continentes.stream().limit(4).forEach(System.out::println);

        //peek
        continentes.stream().peek(str-> System.out.println("Pais "+str)).limit(3).forEach(System.out::println);


        //dropwhile   descarta elementos mientras, acepta un predicado como elemento
        // Si es verdaddero lo descarta, cuando es falso acepta todo lo siguiente
        // el stream debe estar ordenado

        System.out.println();
        System.out.println("dropwhile");
        System.out.println();
        continentes.stream().sorted().dropWhile(x-> x.startsWith("A")).forEach(System.out::println); // descarta elemento que empiecen por a despues de ordenar


        //takewhile muestra elementos hasta verdadero y descarta
        System.out.println();
        System.out.println("takewhile");
        System.out.println();
        //                     // extrae el primer elemento y lo paso a minusculas + resto string
        continentes.stream().map(x->x.substring(0,1).toLowerCase()+x.substring(1)).sorted().takeWhile(x->x.startsWith("a"))
                //      extraigo el primer caracter y lo paso a mayusculas + resto string
                .map(x->Character.toUpperCase(x.charAt(0))+x.substring(1)).forEach(System.out::println);


        //sorted
        System.out.println();
        System.out.println("Ordena usando el Comparator");
        System.out.println();
                                // ordena por longitud de letras
        continentes.stream().sorted(Comparator.comparingInt(String::length)).forEach(System.out::println);


        //distinc
        System.out.println();
        System.out.println("distinc evita repetidos");
        System.out.println();

        continentes.stream().distinct().forEach(System.out::println);

    }
}
