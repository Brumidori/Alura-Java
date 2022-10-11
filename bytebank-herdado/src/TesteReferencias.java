public class TesteReferencias {
    public static void main(String[] args) {
        Funcionario g1 = new Gerente(); // variavel do tipo mais generico - o contrario nao funciona pq nem todo funcionario é gerente
        g1.setNome("Ana ");
        String nome = g1.getNome();

       // g1.autentica(2222); - nao funciona pq g1 é funcionario nao gerente
        System.out.println(nome);

        Gerente g2 = new Gerente();
        g2.setSalario(5000.0);
        EditorVideo ev = new EditorVideo();
        ev.setSalario(2500.0);

        ControleBonificacao controle = new ControleBonificacao();
        controle.registra(g2);
        controle.registra(ev);

        System.out.println(controle.getSoma());
    }
}
