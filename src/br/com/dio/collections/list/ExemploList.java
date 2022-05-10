package br.com.dio.collections.list;

import java.util.*;

public class ExemploList {
    public static void main(String[] args) {
        System.out.println("Crie uma lista e adicione as sete notas: ");

        List<Double> notas = new ArrayList<Double>();
        notas.add(6d);
        notas.add(7.3d);
        notas.add(7.7d);
        notas.add(7.6d);
        notas.add(6.2d);
        notas.add(7.5d);
        notas.add(7.4d);

        System.out.println("\n=======================================\n");
        System.out.println(notas.toString());

        System.out.println("\n=======================================\n");
        System.out.println("Posição da nota 7.6: "+ notas.indexOf(7.6d));

        System.out.println("\n=======================================\n");
        notas.add(4,8d);
        System.out.println(notas);

        System.out.println("\n=======================================\n");
        notas.set(notas.indexOf(7.4),6.0 );
        System.out.println(notas);

        System.out.println("\n=======================================\n");
        System.out.println("Confira se a nota 7.5 está na lista: "+ notas.contains(7.5));

        System.out.println("\n=======================================\n");
        System.out.println("Exiba todas as notas na ordem em que foram informados");
        for (Double nota:notas) System.out.print(nota+" ");

        System.out.println("\n=======================================\n");
        System.out.println("Exiba a terceira nota adicionada: "+ notas.get(2));

        System.out.println("\n=======================================\n");
        System.out.println("Exiba a menor nota: " + Collections.min(notas));

        System.out.println("\n=======================================\n");
        System.out.println("Exiba a maior nota: "+ Collections.max(notas));

        System.out.println("\n=======================================\n");

        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;
        while(iterator.hasNext()){
            Double next = iterator.next();
            soma += next;
        }
        System.out.println("Exiba a soma dos valores: "+soma);

        System.out.println("\n=======================================\n");
        System.out.println("Exiba a média das notas: "+(soma/notas.size()));

        System.out.println("\n=======================================\n");
        System.out.println("Remova a nota 6: ");
        notas.remove(6d);

        System.out.println("\n=======================================\n");
        System.out.println("Remova a nota na posição 0: ");
        notas.remove(0);
        System.out.println(notas);

        System.out.println("\n=======================================\n");
        System.out.println("Remova as notas menores que 7 e exiba a lista: ");
        Iterator<Double> iterator1 = notas.iterator();
        while(iterator1.hasNext()){
            Double next = iterator1.next();
            if(next < 7) iterator1.remove();
        }
        System.out.println(notas);

        System.out.println("\n=======================================\n");
        System.out.println("Apague toda a lista");
        notas.clear();
        System.out.println(notas);

        System.out.println("\n=======================================\n");
        System.out.println("Confira se a lista está vazia: "+ notas.isEmpty());











    }
}
