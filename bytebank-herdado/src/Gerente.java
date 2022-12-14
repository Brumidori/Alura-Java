//herda de Funcionario - atributos e metodos, mas nao é obrigatório
//nao herda construtores
//assina contrato com Autenticavel
public class Gerente extends Funcionario implements Autenticavel {

    public double getBonificacao() {
        return super.salario; //super olha para a classe mae
    }

    private AtenticacaoImpl impl;
    public Gerente (){
        AtenticacaoImpl impl = new AtenticacaoImpl();
    }
    @Override
    public void setSenha(int senha) {

        this.impl.setSenha(senha);
    }

    @Override
    public boolean autentica(int senha) {
        return this.impl.autentica(senha);
    }
}
