package br.com.bytebank.banco.teste.util;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

import java.util.*;

public class TesteOrdenando {
    //para ordenar uma lista é preciso definir um critério de ordenação
    //há duas formas de definir esse critério
    //pela interface Comparator
    //pela interface Comparable (ordem natural)
    //o algoritmo de ordenação já foi implementado
    //na lista no método sort
    //na classe Collections pelo método sort
    //a classe Collections é uma fachada com vários métodos auxiliares para trabalhar com as coleções, principalmente listas

        public static void main(String[] args) {

            Conta cc1 = new ContaCorrente(22, 33);
            Cliente clienteCC1 = new Cliente();
            clienteCC1.setNome("Nico");
            cc1.setTitular(clienteCC1);
            cc1.deposita(333.0);

            Conta cc2 = new ContaPoupanca(22, 44);
            Cliente clienteCC2 = new Cliente();
            clienteCC2.setNome("Guilherme");
            cc2.setTitular(clienteCC2);
            cc2.deposita(444.0);

            Conta cc3 = new ContaCorrente(22, 11);
            Cliente clienteCC3 = new Cliente();
            clienteCC3.setNome("Paulo");
            cc3.setTitular(clienteCC3);
            cc3.deposita(111.0);

            Conta cc4 = new ContaPoupanca(22, 22);
            Cliente clienteCC4 = new Cliente();
            clienteCC4.setNome("Ana");
            cc4.setTitular(clienteCC4);
            cc4.deposita(222.0);

            List<Conta> lista = new ArrayList<>();
            lista.add(cc1);
            lista.add(cc2);
            lista.add(cc3);
            lista.add(cc4);

            for (Conta conta : lista) {
                System.out.println(conta);
            }

            //ComparadorNumeroDaConta comparator = new ComparadorNumeroDaConta();

            //lista.sort(comparator);
            //Collections.sort(lista, new ComparadorNumeroDaConta());
            //Collections.sort(lista);//ordem natural definida na classe conta com o Comparable
            //Collections.reverse(lista);
            System.out.println("com numero comparator ");
            for (Conta conta : lista) {
                System.out.println(conta);
            }

            lista.sort( new ComparadorTitularDaConta());
            System.out.println("com titular comparator ");
            for (Conta conta : lista) {
                System.out.println(conta + ", " + conta.getTitular().getNome());
            }
        }
}

class ComparadorNumeroDaConta implements Comparator<Conta> {

    @Override
    public int compare(Conta o1, Conta o2) {

        return Integer.compare(o1.getNumeroCc(), o2.getNumeroCc());

       // return o1.getNumeroCc() - o2.getNumeroCc();

//        if (o1.getNumeroCc() < o2.getNumeroCc()) {
//            return -1;
//        }
//        if (o1.getNumeroCc() > o2.getNumeroCc()) {
//            return 1;
//        }
//        return 0;
    }
}
    class ComparadorTitularDaConta implements Comparator<Conta>{

        @Override
        public int compare(Conta o1, Conta o2) {
            String nomeC1 = o1.getTitular().getNome();
            String nomeC2 = o2.getTitular().getNome();

            return nomeC1.compareTo(nomeC2);
        }
}

