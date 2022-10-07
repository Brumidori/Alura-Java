public class TestaBanco {

    public static void main(String[] args){

        Cliente bruna = new Cliente();

        bruna.nome = "Bruna Midori";
        bruna.cpf = "6666";
        bruna.profissao = "desenvolvedora";

        Conta contaDaBruna = new Conta();
        contaDaBruna.deposita(100);

        contaDaBruna.titular = bruna;
        System.out.println(contaDaBruna.titular.nome);
    }
}
