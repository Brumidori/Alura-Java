public class TestaValores {
    public static void main(String[] args) {
        Conta conta = new Conta(0, 9090, 24266);

        System.out.println(conta.getAgencia());

        conta.setAgencia(1212121);

        Conta conta2 = new Conta(0, 9090, 24266);

        System.out.println(Conta.getTotal());
    }
}
