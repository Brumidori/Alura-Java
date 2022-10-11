//não pode instanciar desta classe,pq é abstrata - reune caracteristicas/atributos e metodos comuns aos objs
public abstract class Funcionario {
    private String nome;
    private String cpf;
    protected double salario; //publico para as classes filhas

    public Funcionario(){

    }

    //metodo sem corpo, nao ha implementacao
    public abstract double getBonificacao();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
