//contrato autenticavel
//quem assina precisa implementar setSenha e autentica
//interface nao tem nada concreto (atributos ou corpo de metodo) - puro polimorfismo
public interface Autenticavel {


   public abstract void setSenha(int senha);

   public abstract boolean autentica(int senha);
}
