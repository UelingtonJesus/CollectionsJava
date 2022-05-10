package br.com.dio.collections.list;
/*Dadas as seguintes informações sobre meus gatos, crie uma lista
e ordene esta lista exibindo:
(nome - idade - cor);
Gato 1 = nome: Jon, idade: 18, cor: preto
Gato 2 = nome: Simba, idade: 6, cor: tigrado
Gato 3 = nome: Jon, idade: 12, cor: amarelo
*/



import java.util.*;


public class ExemploOrdenacaoList {
    public static void main(String[] args) {

        List<Gato> meusGatos = new ArrayList<>(){{
            add(new Gato("John", "amarelo",18));
            add(new Gato("Simba", "tigrado",6));
            add(new Gato("John", "preto",12));

        }};


        List<Character> consoantesMeuNome = Arrays.asList('c', 'm', 'l', 'c', 'v', 'l', 'c', 'n', 't');
        System.out.println(consoantesMeuNome);

       System.out.println("--\tOrdem de Inserção\t---");
        System.out.println(meusGatos);


        System.out.println("\n======================================\n");
        System.out.println("--\tOrdem aleatória\t---");
        Collections.shuffle(meusGatos);
        System.out.println(meusGatos);

        System.out.println("\n======================================\n");
        System.out.println("--\tOrdem Natural (Nome)\t---");
        Collections.sort(meusGatos);
        System.out.println(meusGatos);

        System.out.println("\n======================================\n");
        System.out.println("--\tOrdem Idade\t---");
        //Collections.sort(meusGatos, new ComparatorIdade());
        meusGatos.sort(new Gato.ComparatorIdade());
        System.out.println(meusGatos);


        System.out.println("\n======================================\n");
        System.out.println("--\tOrdem cor\t---");
        Collections.sort(meusGatos, new Gato.ComparatorCor());
        //meusGatos.sort(new Gato.ComparatorCor());
        System.out.println(meusGatos);

        System.out.println("\n======================================\n");
        System.out.println("--\tOrdem Nome/Cor/Idade\t---");
        meusGatos.sort(new Gato.ComparatorNomeCorIdade());
        System.out.println(meusGatos);



    }
}

class Gato implements Comparable<Gato>{
    private String nome, cor;
    private Integer  idade;

    public Gato(String nome, String cor, Integer idade) {
        this.nome = nome;
        this.cor = cor;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", cor='" + cor + '\'' +
                ", idade=" + idade +
                '}';
    }

    @Override
    public int compareTo(Gato gato) {
        return this.getNome().compareToIgnoreCase(gato.getNome());
    }

    static class ComparatorIdade implements Comparator<Gato>{

        @Override
        public int compare(Gato g1, Gato g2) {
            return Integer.compare(g1.getIdade(), g2.getIdade());
        }
    }

    static class ComparatorCor implements Comparator<Gato>{

        @Override
        public int compare(Gato g1, Gato g2) {
            return g1.getCor().compareToIgnoreCase(g2.getCor());
        }
    }

    static class ComparatorNomeCorIdade implements Comparator<Gato>{

        @Override
        public int compare(Gato g1, Gato g2) {
            int nome = g1.getNome().compareToIgnoreCase(g2.getNome());
            if(nome != 0)return nome;
            int cor = g1.getCor().compareToIgnoreCase(g2.getCor());
            if(cor != 0)return cor;

            return Integer.compare(g1.getIdade(), g2.getIdade());
        }
    }
}


