public class Fluxo {

    public static void main(String[] args) {
        System.out.println("Ini do main");
        try {
            metodo1();
        }catch (ArithmeticException | NullPointerException e) {
            String msg = e.getMessage();
            System.out.println("Error: " + msg);
            e.printStackTrace();
        }
        System.out.println("Fim do main");
    }

    private static void metodo1() {
        System.out.println("Ini do metodo1");
        metodo2();
        System.out.println("Fim do metodo1");
    }

    private static void metodo2() {
        System.out.println("Ini do metodo2");
//        for(int i = 1; i <= 5; i++) {
//            System.out.println(i);
//            int a = i/0;
//            Conta c = null;
//            c.deposita();
//        }
        ArithmeticException ex = new ArithmeticException("deu errado");
        throw ex;
        //System.out.println("Fim do metodo2");
    }

// Não é necessário guardar a exceção em uma referência, você pode lançá-la diretamente em uma linha só:
//    private static void metodo2() {
//        System.out.println("Ini do metodo2");
//        throw new ArithmeticException();
//    }
}
