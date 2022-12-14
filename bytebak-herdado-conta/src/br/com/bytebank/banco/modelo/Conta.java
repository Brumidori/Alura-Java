package br.com.bytebank.banco.modelo;

// se nao declarado o modificador de acesso (public/private) o valor default é private package

/**
 * @param agencia
 * @param numero
 */

 public abstract class Conta extends Object implements Comparable<Conta>{

     protected double saldo;
    private int agencia;
    private int numeroCc;
    private Cliente titular;

    //static indica que é da classe e não da instancia (objeto conta)
    private static int total;

    //construtor obriga a ter atributos (passa os valores iniciais) - evitando problemas de metodos e validacao com atributos inicializados em memória
    public Conta(double saldo, int agencia, int numeroCc){
        this.saldo = saldo;
        this.agencia = agencia;
        this.numeroCc = numeroCc;
        Conta.total++;
        //System.out.println("O total de contas é " + br.com.bytebank.banco.modelo.Conta.total);
    }

    public Conta() {
    }

    public Conta(int agencia, int numeroCc) {
        this.agencia = agencia;
        this.numeroCc = numeroCc;
    }

    public abstract void deposita (double valor);

    /**
     * Valor precisa ser menor ou igual ao saldo
     * @param valor
     * @throws SaldoInsuficienteException
     */
    public void saca (double valor) throws SaldoInsuficienteException {

        if (this.saldo < valor) {
            throw new SaldoInsuficienteException("Saldo: " + this.saldo + ", valor: " + valor);
        }

        this.saldo -= valor;

    }

    public void transfere (double valor, Conta destino) throws SaldoInsuficienteException {
        this.saca(valor);
        destino.deposita(valor);

    }

    public double getSaldo() {
        return this.saldo;
    }

    public int getNumeroCc(){
        return this.numeroCc;
    }

    public void setNumeroCc(int novoNumero){
        if (novoNumero <= 0){
            System.out.println("O número não pode ser menor igual a 0");
        }
        this.numeroCc = novoNumero;
    }

    public int getAgencia() {
        return this.agencia;
    }

    public void setAgencia(int agencia) {
        if (agencia <= 0) {
            System.out.println("O número não pode ser menor igual a 0");
        } else {
            this.agencia = agencia;
        }
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    //static indica que método é da classe (não precisa instanciar objeto para chamar)
    public static int getTotal() {

        return Conta.total;
    }

    @Override
    public String toString() {
        return "Numero: " + this.numeroCc + ", Agencia: " + this.agencia + ", Saldo: " + this.saldo;
    }

    public boolean equals(Conta outra) {

        if(this.agencia != outra.agencia) {
            return false;
        }

        if(this.numeroCc != outra.numeroCc) {
            return false;
        }

        return true;
    }

    @Override
    public int compareTo(Conta outro) {
        return Double.compare(this.saldo, outro.saldo);
    }

}
