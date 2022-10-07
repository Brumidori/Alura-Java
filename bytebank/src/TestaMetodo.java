public class TestaMetodo {

    public static void main(String[] args){
        Conta contaDaBruna = new Conta();
        contaDaBruna.saldo = 100;

        contaDaBruna.deposita(50);

        System.out.println("Saldo da Bruna " + contaDaBruna.saldo);

        contaDaBruna.saca(20);
        System.out.println("Saldo da Bruna " + contaDaBruna.saldo);

        Conta contaDoPaulo = new Conta();
        contaDoPaulo.deposita(1000);

        if(contaDoPaulo.transfere(300, contaDaBruna)){
            System.out.println("Transferência realizada com sucesso!");
        } else {
            System.out.println("Saldo insuficiente");
        };

        System.out.println("Saldo da Bruna " + contaDaBruna.saldo);
    }
}
