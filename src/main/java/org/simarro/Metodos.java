package org.simarro;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Metodos {

    public static void main(String[] args) throws IOException {

        // makigas https://www.youtube.com/watch?v=p211H0CL8Rs&t=518s

        var continentes= Arrays.asList("America","Europa", "Asia", "America", "Oceania","Africa");


        System.out.println("Distintos");
        continentes.stream().distinct()
                .forEach(System.out::println);

        System.out.println();
        System.out.println(
                "Ordenar:     ");
        continentes.stream().sorted().forEach(System.out::println);


        // Oggi     https://www.youtube.com/watch?v=t1-YZ6bF-g0


        //Integer stream
        IntStream.range(1,10).forEach(System.out::print);
        System.out.println();

        // imprimir impares
        IntStream.range(1,10).filter(x->x%2!=0).forEach(x-> System.out.println(x));
        System.out.println();


        // saltar los 3 primeros valores
        IntStream.range(1,10).skip(3).forEach(System.out::print);
        System.out.println();


        // imprimir numeros que terminen en 0
        IntStream.range(1,100).filter(x->x%10==0).forEach(x-> System.out.print(x+ " "));
        System.out.println();

        //sumar valores
        System.out.println(IntStream.range(1, 5).sum());
        System.out.println();

        //encontrar texto
        Stream.of("Ava","Aneri","Alberto").sorted().findFirst().ifPresent(System.out::println);
        System.out.println();


    // ordenar llista
        Arrays.asList("a","d","c","j","t").stream().sorted().forEach(System.out::println);
        System.out.println();




        // ordenar llista, filtrar
        Arrays.asList("a","d","c","j","t").stream().filter(x->x.startsWith("j")).forEach(System.out::println);
        System.out.println();


        //  Calcular merdia
        Arrays.stream(new int[] {2,5,6,7,8,9}).average().ifPresent(System.out::println);
        System.out.println();

        // stream de lista
        // de la lista, pas a minusculas e improme los que empiecen por a
        Arrays.asList("al","Ankit","brent","carlo","amanda","Hans","berto").stream().map(String::toLowerCase).filter(x->x.startsWith("a")).forEach(System.out::println);
        System.out.println();



        //  Imprime las lineas que sean mayor que 5
        System.out.println("Current working directory: " + System.getProperty("user.dir"));

        Path path = Paths.get("src/bands.txt");
        Path act = Paths.get("src/main/java/org.simarro/Metodos");

        System.out.println(path);
        System.out.println(act);

        try (Stream<String> bands = Files.lines(path)) {
            bands.sorted()
                    .filter(line -> line.length() > 5)
                    .forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println();

         ArrayList<String> nombres= new ArrayList<>();
        nombres.add("Jhon");
        nombres.add("Jose");
        nombres.add("Adrian");
        nombres.add("Caerlo");
        nombres.add("Sergio");
        nombres.add("David");
        nombres.add("Hercules");
        nombres.add("Serme");

        System.out.println("Nombres ordenados alfabeticamente");
        nombres.stream().sorted().forEach(System.out::println);

        System.out.println("Nombres ordenados alfabeticamente");
        nombres.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);

        System.out.println("Buscar nombre");
        nombres.stream().map(String::toLowerCase).filter(x->x.equals("david")).forEach(System.out::println);

        IntStream.range(1,10).filter(x->x%2==0).forEach(System.out::println);

        System.out.println(Arrays.stream(new int[]{1, 2, 3, 4, 5, 6}).sum());

        List<Integer> numeros= new ArrayList<>(Arrays.asList(-1,-1,-3,-5));

        numeros.addAll(Arrays.asList(1,2,2,3,4,5,6));


        numeros.stream().filter(x->x>=0).forEach(System.out::println);




        Integer[] nums={1,2,3,4,6};
        Arrays.stream(nums).filter(x->x%2!=0).sorted(Comparator.reverseOrder()).forEach(System.out::print);


        System.out.println();
        System.out.println(Arrays.stream(nums).mapToDouble(Integer::doubleValue).sum());

        System.out.println();
        System.out.println(Arrays.stream(nums).count());

        System.out.println();
        Arrays.stream(nums).mapToDouble(Integer::intValue).average().ifPresent(System.out::println);


        System.out.println("Casting");

        Arrays.stream(nums).mapToDouble(x-> x).average().ifPresent(System.out::println);




    }
}
