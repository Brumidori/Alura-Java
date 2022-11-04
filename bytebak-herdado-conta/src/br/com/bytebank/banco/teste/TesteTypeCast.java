package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteTypeCast {

//    uma array do tipo Object pode guardar qualquer tipo de referência
//    quando convertemos uma referência genérica para uma referência mais específica é preciso usar um type cast
//    o cast só compila quando é possível, mesmo assim pode falhar na hora de rodar
//    quando o type cast falha podemos receber uma ClassCastException
//    para receber valores ao chamar o programa Java na linha de comando podemos usar o array String[] no método main

    public static void main(String[] args) {

        int numero = 3;
        double valor = numero; //cast implícito

        int n = 3;
        double v = (double) numero; //cast explícito

        double va = 3.56;
        int nu = (int) va; //cast explicito é exigido pelo compilador

//        ContaCorrente cc1 = new ContaCorrente(22, 33);
//        Conta conta = cc1; //cast implicito

        ContaCorrente cc1 = new ContaCorrente(22, 33);
        Conta conta = (Conta) cc1; //cast explícito mas desnecessário

        //O cast explicito só funciona se ele for possível, mas há casos em que o compilador sabe que um cast é
        // impossível e aí nem compila, nem com type cast.
    }
}
