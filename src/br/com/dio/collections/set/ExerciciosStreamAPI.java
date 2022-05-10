package br.com.dio.collections.set;
import java.util.*;
import java.util.function.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ExerciciosStreamAPI {
    public static void main(String[] args) {


        List<String> numerosAleatorios =
                Arrays.asList("1", "0", "4", "1", "2", "3", "9", "9", "6", "5");


        System.out.println("\n=============================================\n");
        System.out.println("Imprima todos os elementos dessa lista de String: ");
        numerosAleatorios.forEach(System.out::println);


        System.out.println("\n=============================================\n");
        System.out.println("Pegue os 5 primeiros números e coloque dentro de um Set:");
        numerosAleatorios.stream().limit(5).collect(Collectors.toSet()).forEach(System.out::println);

        System.out.println("\n=============================================\n");
        System.out.println("Transforme esta lista de String em uma lista de números inteiros.");
        numerosAleatorios.stream()
                        .map(Integer::parseInt)
                                .collect(Collectors.toList())
                                        .forEach(System.out::println);




        System.out.println("\n=============================================\n");
        System.out.println("Pegue os números pares e maiores que 2 e coloque em uma lista:");
        /*List<Integer> ListParesMaioresQue2 = numerosAleatorios.stream()
                .map(Integer::parseInt)
                .filter(new Predicate<Integer>() {
                    @Override
                    public boolean test(Integer i) {
                        if (i % 2 == 0 && i > 2) return true;
                        return false;
                    }
                }).collect(Collectors.toList());
        System.out.println(ListParesMaioresQue2);*/
        List<Integer> ListParesMaioresQue2 = numerosAleatorios.stream()
                .map(Integer::parseInt)
                .filter(i -> (i % 2 == 0 && i > 2))
                .collect(Collectors.toList());
        System.out.println(ListParesMaioresQue2);


        System.out.println("\n=============================================\n");
        System.out.println("Mostre a média dos números: ");
        numerosAleatorios.stream()
                        .mapToInt(Integer::parseInt)
                                .average()
                .ifPresent(System.out::println);



        System.out.println("\n=============================================\n");
        System.out.println("Remova os valores ímpares: ");
        List<Integer> numerosAleatoriosInteger = numerosAleatorios.stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        numerosAleatoriosInteger.removeIf(integer -> (integer % 2 != 0));
        System.out.println(numerosAleatoriosInteger);


//        Para você
        System.out.println("\n=============================================\n");
        System.out.println("Ignore os 3 primeiros elementos da lista e imprima o restante:");

        System.out.println("\n=============================================\n");
        //System.out.println("Retirando os números repetidos da lista, quantos números ficam? " + countNumerosUnicos);

        System.out.println("\n=============================================\n");
        System.out.print("Mostre o menor valor da lista: ");


        System.out.println("\n=============================================\n");
        System.out.print("Mostre o maior valor da lista: ");


        System.out.println("\n=============================================\n");
        //System.out.println("Pegue apenas os números ímpares e some: " + somaDosNumerosPares);

        System.out.println("\n=============================================\n");
        System.out.println("Mostre a lista na ordem númerica: ");


        System.out.println("\n=============================================\n");
        System.out.println("Agrupe os valores ímpares múltiplos de 3 ou de 5:");
//        dica: collect(Collectors.groupingBy(new Function())

    }
}
