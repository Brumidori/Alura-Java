public class ControleBonificacao {

    private double soma;

    //polimorfismo - método genérico que se aploica a classes diferentes com as peculiaridades de cada
    public void registra (Funcionario g){
        double boni = g.getBonificacao();
        soma += boni;
    }

    public double getSoma() {return soma;}
}
