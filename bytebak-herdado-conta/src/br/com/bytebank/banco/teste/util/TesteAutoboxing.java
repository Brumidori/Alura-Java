package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;
import java.util.List;

public class TesteAutoboxing {

        public static void main(String[] args) {

            int[] idades = new int[5];

            String[] nomes = new String[5];

            //o ArrayList nao deveria guardar idade ou simplesmente o n 29, pq se tratam de primitivos
            //o Array apenas guarda referencias - o Java automaticamente transforma o primitivos em Objeto

            int idade = 29;//Integer
            Integer idadeRef = new Integer(29);// nao é a forma certa de criar Integer
            Integer idadeRef2 = Integer.valueOf(29);//forma correta
            List<Integer> numeros = new ArrayList<Integer>();
            numeros.add(29);



        }
    }

