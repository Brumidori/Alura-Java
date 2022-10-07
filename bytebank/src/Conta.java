public class Conta {

    public double saldo;
    int agencia;
    int numeroCc;
    String titular;

    public void deposita (double valor) {
        this.saldo += valor;
    }

    public boolean saca (double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }

    }

    public boolean transfere (double valor, Conta destino) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            destino.deposita(valor);
            return true;
        }else {
            return false;
        }

    }
}
