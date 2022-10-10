public class TesteContas {

    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(001, 1111);
        cc.deposita(100);

        ContaPoupanca cp = new ContaPoupanca(002, 2222);
        cp.deposita(200);

        cc.transfere(10, cp);
        //os metodos da classe conta são herdadados pela cc e cp

        System.out.println(cc.getSaldo());
        System.out.println(cp.getSaldo());
    }
}
