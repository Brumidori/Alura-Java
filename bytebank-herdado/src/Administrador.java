public class Administrador extends Funcionario implements Autenticavel {

    @Override
    public double getBonificacao() {
        return 50;
    }

    private AtenticacaoImpl impl;
    public Administrador (){
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
