public class ContaPoupanca extends Conta {

    public ContaPoupanca(int agencia, int numeroCc) {
        super(agencia, numeroCc);
    }

    @Override
    public void deposita (double valor) {
        super.saldo += valor;
    }
}


