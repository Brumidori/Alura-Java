package br.com.bytebank.banco.modelo;

//não herda construtor - herda atributos e métodos
public class ContaCorrente extends Conta implements Tributavel {
    //precis de um construtor - mesmo o padrão precisa de um método (super())- que precisa ser explicito na mãe
    public ContaCorrente(int agencia, int numeroCc) {
        super(agencia, numeroCc);
    };

    //para reescrita de um método deve ter a mesma assinatura - tipo, nome e parametro
    //override força sobreescrita - se nao corre risco de ser sobrecarga
    @Override //sabe a intencao de sobrescrever e verifica os requisitos
    public void saca (double valor) throws SaldoInsuficienteException{
        double valorASacar = valor + 0.2;
        super.saca(valorASacar);

    }

    @Override
    public void deposita (double valor) {
        super.saldo += valor;
    }

    @Override
    public double getValorImposto(){
        return super.saldo * 0.1;
    }
}
