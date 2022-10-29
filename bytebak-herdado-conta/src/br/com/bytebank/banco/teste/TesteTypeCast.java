package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteTypeCast {
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
    }
}
