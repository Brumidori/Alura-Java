public class Cliente implements Autenticavel{


    private AtenticacaoImpl impl;

    public Cliente (){
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
