//não herda construtor - herda atributos e métodos
public class ContaCorrente extends Conta{
    //precis de um construtor - mesmo o padrão precisa de um método (super())- que precisa ser explicito na mãe
    public ContaCorrente(int agencia, int numeroCc) {
        super(agencia, numeroCc);
    };

    //para reescrita de um método deve ter a mesma assinatura - tipo, nome e parametro
    @Override //sabe a intencao de sobrescrever e verifica os requisitos
    public boolean saca (double valor) {
        double valorASacar = valor + 0.2;
        return super.saca(valorASacar);

    }
}
