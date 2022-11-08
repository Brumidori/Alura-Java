package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;
import java.util.List;

public class TesteAutoboxing {

//    Nessa aula focamos nas classes WRAPPERS e aprendemos que
//
//    para cada primitivo existe uma classe chamada Wrapper
//    para guardar um primitivo numa coleção é preciso criar um objeto que embrulha o valor
//    a criação do objeto Wrapper é chamada de autoboxing
//    a retirada do valor primitivo do objeto Wrapper é chamada de unboxing
//    autoboxing e unboxing acontecem automaticamente.
//    as classes wrapper possuem vários métodos auxiliares, por exemplo para o parsing
//    todas as classes wrappers que representam um valor numérico possuem a classe java.lang.Number como mãe

        public static void main(String[] args) {

            //o ArrayList nao deveria guardar idade ou simplesmente o n 29, pq se tratam de primitivos
            //o Array apenas guarda referencias - o Java automaticamente transforma o primitivos em Objeto

            int idade = 29;//Integer
            Integer idadeRef = new Integer(29);// nao é a forma certa de criar Integer
            Integer idadeRef2 = Integer.valueOf(29);//forma correta autoboxing
            int valor = idadeRef2.intValue(); // unboxing

            List<Integer> numeros = new ArrayList<Integer>();
            numeros.add(29); // Autoboxing

            String s = args[0];

           // Integer numero = Integer.valueOf(s);

            int numero = Integer.parseInt(s);
            System.out.println(numero);


        }
    }

