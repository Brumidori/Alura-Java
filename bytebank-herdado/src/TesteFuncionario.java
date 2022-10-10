public class TesteFuncionario {
    public static void main(String[] args) {
        Funcionario nico = new Funcionario();
        nico.setNome("Nico Steppat");
        nico.setSalario(2590.80);

        System.out.println(nico.getNome());
        System.out.println(nico.getBonificacao());
    }
}
