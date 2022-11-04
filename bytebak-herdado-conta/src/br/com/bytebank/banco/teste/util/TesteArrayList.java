package br.com.bytebank.banco.teste.util;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

import java.util.ArrayList;

public class TesteArrayList {

    //Array: acesso ao elemento facil; adicionar elementos; remover elementos - reorganiza;
    //LinkedList e ArrayList são duas implementações diferentes da interface List. A LinkedList é uma lista duplamente
    // "linkada" e a ArrayList representa um array com redimensionamento dinâmico.

    //ArrayList: acesso fácil e performático pelo índice; elementos precisam ser copiados quando não há mais capacidade
    //LinkedList: inserção e remoção performática em qualquer posição, também no início; acesso mais demorado
    // pelo índice, é preciso pesquisar os elementos

    public static void main(String[] args) {

        //Generics
        ArrayList<Conta> lista = new ArrayList<Conta>();


        Conta cc = new ContaCorrente(22, 33);
        Conta cc2 = new ContaCorrente(22, 11);

        lista.add(cc);
        lista.add(cc2);

        System.out.println(lista.size());

        Conta ref = lista.get(1);
        System.out.println(ref.getNumeroCc());
        System.out.println(ref.getAgencia());

        lista.remove(1);
        System.out.println(lista.size());

        Conta cc3 = new ContaCorrente(22, 22);
        lista.add(cc3);

        Conta cc4 = new ContaCorrente(22,13);
        lista.add(cc4);

        for(int i = 0; i < lista.size(); i++){
            Conta o = lista.get(i);
            System.out.println(o);
        }

        System.out.println("Método for each");
        for( Conta o : lista){
            System.out.println(o);
        }

    }
}
