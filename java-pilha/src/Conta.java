public class Conta {

    public Conta(int agencia, int numero) {

        if (agencia < 1) {
            throw new IllegalArgumentException("Agencia inválida");
        }

        if (numero < 1) {
            throw new IllegalArgumentException("Numero da conta inválido");
        }
    }

    void deposita () throws MinhaExcecao{};
}
