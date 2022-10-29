package br.com.bytebank.banco.teste;

public class TesteArray {

    public static void main(String[] args) {
        int [] idades = new int[5];

//        idades[0] = 29;
//        idades[1] = 39;
//        idades[2] = 40;
//        idades[3] = 90;
//        idades[4] = 12;
//
//        System.out.println(idades[4]);

        for(int i = 0; i < idades.length; i++) {
            idades[i] = i*i;
        }

        for(int i = 0; i < idades.length; i++) {
            System.out.println(idades[i]);
        }
        

    }
}
