public class TestaContaComExecaoChecked {

    public static void main(String[] args) {
        Conta c = new Conta(212, 321);
        try {
            c.deposita();
        } catch (MinhaExcecao ex){
            System.out.println("tratamento.....");
        }



    }
}
