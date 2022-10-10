public class EditorVideo extends Funcionario{

    public double getBonificacao() {
        return super.getBonificacao() + 100 ; //super olha para a classe mae
    }
}
