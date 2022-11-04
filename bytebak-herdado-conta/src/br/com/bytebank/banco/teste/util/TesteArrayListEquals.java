package br.com.bytebank.banco.teste.util;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

import java.util.ArrayList;

public class TesteArrayListEquals {

    public static void main(String[] args) {

        //Generics
        ArrayList<Conta> lista = new ArrayList<Conta>();


        Conta cc = new ContaCorrente(22, 33);
        Conta cc2 = new ContaCorrente(22, 11);

        lista.add(cc);
        lista.add(cc2);

        Conta cc3 = new ContaCorrente(22, 11);

        boolean existe = lista.contains(cc3);
        System.out.println("Já existe: " + existe);

        //== compara referencias - no caso abaixo são objetos diferentes
        for(Conta conta : lista) {
            if(conta == cc3) {
                System.out.println("ja tenho essa conta!");
            }
        }

        // o método contains() faz um laço internamente, e chama o método equals(). Entretanto ele,
        // por padrão da classe Object, compara as referências. Como agora o sobrescrevemos,
        // ele passará a funcionar conforme nossa regra de igualdade.
        for(Conta conta : lista) {
            if(conta.equals(cc3)) {
                System.out.println("ja tenho essa conta!");
            }
        }


        System.out.println("Método for each");
        for( Conta o : lista){
            System.out.println(o);
        }

    }
}
