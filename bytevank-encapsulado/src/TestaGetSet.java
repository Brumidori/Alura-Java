public class TestaGetSet {

    public static void main(String[] args) {
        Conta contaDaBruna = new Conta(0, 1337, 24266);

        contaDaBruna.setNumeroCc(1337);
        System.out.println(contaDaBruna.getNumeroCc());

        Cliente bruna = new Cliente();

        contaDaBruna.setTitular(bruna);

        bruna.setNome("Bruna Midori");
        bruna.setCpf("666");
        bruna.setProfissao("dev");

        System.out.println(contaDaBruna.getTitular());
        System.out.println(contaDaBruna.getTitular().getNome());
        System.out.println(bruna.getNome());

        contaDaBruna.getTitular().setProfissao("programadora");
        //mesmo código em duas linhas
        Cliente titular = contaDaBruna.getTitular();
        titular.setProfissao("programadora");

        System.out.println(contaDaBruna.getTitular().getProfissao());

    }
}
